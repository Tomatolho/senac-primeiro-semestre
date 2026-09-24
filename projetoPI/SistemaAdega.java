package projetoPI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ==========================================
// CLASSE QUE REPRESENTA O PRODUTO (BEBIDA)
// ==========================================
class Produto {
    String nome;
    String categoria;
    double precoCusto;
    int quantidadeEstoque;
    double aliquotaImposto;
    double precoVendaSugerido;
}

public class SistemaAdega {

    private static List<Produto> listaDeProdutos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("   SISTEMA DE ESTOQUE TRIBUTÁVEL - ADEGA   ");
            System.out.println("==========================================");
            System.out.println("1. Cadastrar Nova Bebida");
            System.out.println("2. Exibir Relatório de Impostos no Estoque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lemos a entrada como texto para evitar que o programa quebre ou entre em loop se digitarem letras
            String entradaMenu = scanner.nextLine();
            
            try {
                opcao = Integer.parseInt(entradaMenu); // Tenta converter o texto digitado em número inteiro
            } catch (NumberFormatException e) {
                System.out.println("\n[Erro] Digite apenas o número correspondente à opção (1, 2 ou 3)!");
                opcao = 0; // Reseta para continuar no loop
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    exibirRelatorioImpostosEstoque();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema... Até logo!");
                    break;
                default:
                    System.out.println("\n[Erro] Opção inválida! Escolha entre 1 e 3.");
            }
        } while (opcao != 3);
    }

    // ------------------------------------------
    // FUNÇÃO: Definir a alíquota de imposto baseada no char escolhido
    // ------------------------------------------
    public static double obterImpostoPorTipo(char tipo) {
        switch (Character.toUpperCase(tipo)) {
            case 'C':
                return 0.15; // Cerveja (15%)
            case 'V':
                return 0.20; // Vinho (20%)
            case 'D':
                return 0.30; // Destilado (30%)
            default:
                return 0.18; // Padrão caso digite algo errado
        }
    }

    // ------------------------------------------
    // PROCEDIMENTO: Cadastrar um novo produto com tratamento de erros
    // ------------------------------------------
    public static void cadastrarProduto() {
        System.out.println("\n--- Cadastro de Bebida na Adega ---");
        
        Produto novoProd = new Produto();
        
        System.out.print("Digite o nome da bebida: ");
        novoProd.nome = scanner.nextLine();
        
        // Seleção do tipo usando char com validação de entrada
        char tipoOpcao = ' ';
        boolean tipoValido = false;
        
        while (!tipoValido) {
            System.out.println("Escolha a categoria do produto:");
            System.out.println(" [C] Cerveja");
            System.out.println(" [V] Vinho");
            System.out.println(" [D] Destilado");
            System.out.print("Digite a letra correspondente: ");
            
            String entrada = scanner.nextLine();
            if (entrada.length() > 0) {
                tipoOpcao = entrada.charAt(0);
                char letraMaiuscula = Character.toUpperCase(tipoOpcao);
                
                if (letraMaiuscula == 'C' || letraMaiuscula == 'V' || letraMaiuscula == 'D') {
                    tipoValido = true;
                    if (letraMaiuscula == 'C') novoProd.categoria = "Cerveja";
                    else if (letraMaiuscula == 'V') novoProd.categoria = "Vinho";
                    else novoProd.categoria = "Destilado";
                } else {
                    System.out.println("\n[Erro] Opção inválida! Digite apenas C, V ou D.\n");
                }
            } else {
                System.out.println("\n[Erro] Você precisa digitar uma letra!\n");
            }
        }
        
        // Leitura do preço de custo com tratamento de erro usando Integer/Double.parseDouble
        boolean precoValido = false;
        while (!precoValido) {
            System.out.print("Digite o preço de custo unitário (R$): ");
            String entradaPreco = scanner.nextLine().replace(',', '.'); // Troca vírgula por ponto para aceitar 10,50 ou 10.50
            try {
                novoProd.precoCusto = Double.parseDouble(entradaPreco);
                if (novoProd.precoCusto < 0) {
                    System.out.println("[Erro] O preço não pode ser negativo.");
                    continue;
                }
                precoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("[Erro] Digite um valor numérico válido (ex: 10.50).");
            }
        }

        // Leitura da quantidade com tratamento de erro
        boolean qtdValida = false;
        while (!qtdValida) {
            System.out.print("Digite a quantidade em estoque: ");
            String entradaQtd = scanner.nextLine();
            try {
                novoProd.quantidadeEstoque = Integer.parseInt(entradaQtd);
                if (novoProd.quantidadeEstoque < 0) {
                    System.out.println("[Erro] A quantidade não pode ser negativa.");
                    continue;
                }
                qtdValida = true;
            } catch (NumberFormatException e) {
                System.out.println("[Erro] Digite apenas números inteiros.");
            }
        }
        
        novoProd.aliquotaImposto = obterImpostoPorTipo(tipoOpcao);
        
        double custoComImposto = novoProd.precoCusto * (1 + novoProd.aliquotaImposto);
        novoProd.precoVendaSugerido = custoComImposto * 1.40;
        
        listaDeProdutos.add(novoProd);
        
        System.out.println("\n[Sucesso] Produto cadastrado!");
        System.out.println("Imposto aplicado automaticamente para " + novoProd.categoria + ": " + (int)(novoProd.aliquotaImposto * 100) + "%");
        System.out.printf("Preço de venda sugerido para garantir lucro: R$ %.2f\n", novoProd.precoVendaSugerido);
    }

    // ------------------------------------------
    // PROCEDIMENTO: Relatório de capital travado em impostos
    // ------------------------------------------
    public static void exibirRelatorioImpostosEstoque() {
        if (listaDeProdutos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado no estoque ainda.");
            return;
        }

        double valorTotalEstoque = 0;
        double totalImpostosEmbutidos = 0;
        
        System.out.println("\n=== RELATÓRIO FISCAL DO ESTOQUE ===");
        
        for (Produto item : listaDeProdutos) {
            double valorItem = item.precoCusto * item.quantidadeEstoque;
            double impostoItem = valorItem * item.aliquotaImposto;
            
            valorTotalEstoque += valorItem;
            totalImpostosEmbutidos += impostoItem;
            
            System.out.println("- " + item.nome + " (" + item.categoria + "): " 
                               + item.quantidadeEstoque + " un | Custo Total: R$ " + String.format("%.2f", valorItem));
        }
        
        System.out.println("------------------------------------------");
        System.out.printf("Valor total investido no estoque: R$ %.2f\n", valorTotalEstoque);
        System.out.printf("Valor aproximado retido em impostos: R$ %.2f\n", totalImpostosEmbutidos);
    }
}