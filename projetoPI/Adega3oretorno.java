package projetoPI;
import java.util.Scanner;

public class Adega3oretorno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MAX_PRODUTOS = 100;
        int totalCadastrados = 0;

        String[] nomes = new String[MAX_PRODUTOS];
        String[] categorias = new String[MAX_PRODUTOS];
        double[] precosCompra = new double[MAX_PRODUTOS]; 
        double[] precosVenda = new double[MAX_PRODUTOS];  
        int[] quantidades = new int[MAX_PRODUTOS];
        int[] estoquesMinimos = new int[MAX_PRODUTOS];
        double[] aliquotas = new double[MAX_PRODUTOS];

        double caixaDoDia = 0.0;
        double totalImpostos = 0.0;

        nomes[0] = "Heineken 600ml"; categorias[0] = "Cerveja"; precosCompra[0] = 8.50; precosVenda[0] = 14.50; quantidades[0] = 5; estoquesMinimos[0] = 20; aliquotas[0] = 18.0;
        nomes[1] = "Vinho Casillero"; categorias[1] = "Vinho"; precosCompra[1] = 40.00; precosVenda[1] = 65.00; quantidades[1] = 12; estoquesMinimos[1] = 10; aliquotas[1] = 27.0;
        nomes[2] = "Gin Tanqueray"; categorias[2] = "Destilado"; precosCompra[2] = 85.00; precosVenda[2] = 120.00; quantidades[2] = 30; estoquesMinimos[2] = 5; aliquotas[2] = 18.0;
        totalCadastrados = 3;

        int opcao = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("          SISTEMA GERENCIAL ADEGA         ");
            System.out.println("==========================================");
            System.out.printf(" CAIXA ATUAL: R$ %.2f%n", caixaDoDia);
            System.out.println("------------------------------------------");
            System.out.println("1. Vender Bebida (PDV)");
            System.out.println("2. Cadastrar Novo Produto");
            System.out.println("3. Relatório de Estoque Completo");
            System.out.println("4. Alerta de Estoque Baixo (Reposição)");
            System.out.println("5. Excluir Produto");
            System.out.println("6. Filtrar por Categoria");
            System.out.println("7. Relatório Tributário");
            System.out.println("8. Sair");
            
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("[Erro] Digite apenas números inteiros!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    if (totalCadastrados == 0) {
                        System.out.println("\n[Aviso] Estoque vazio!");
                    } else {
                        System.out.println("\n--- Selecione a Bebida ---");
                        for (int i = 0; i < totalCadastrados; i++) {
                            if (quantidades[i] == 0) {
                                System.out.printf("[%d] %s | R$ %.2f | [ESTOQUE ESGOTADO]%n", i, nomes[i], precosVenda[i]);
                            } else {
                                System.out.printf("[%d] %s | R$ %.2f | Estoque: %d | Imposto embutido: %.2f%%%n", i, nomes[i], precosVenda[i], quantidades[i], aliquotas[i]);
                            }
                        }

                        System.out.print("\nDigite o NÚMERO do produto: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("[Erro] Digite o número do produto: ");
                            scanner.nextLine();
                        }
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 0 && indice < totalCadastrados) {
                            if (quantidades[indice] == 0) {
                                System.out.println("[Erro] Produto esgotado! Não é possível realizar a venda.");
                            } else {
                                System.out.printf("Vender quantas unidades de %s? ", nomes[indice]);
                                while (!scanner.hasNextInt()) {
                                    System.out.print("[Erro] Digite um número para a quantidade: ");
                                    scanner.nextLine();
                                }
                                int qtdVenda = scanner.nextInt();
                                scanner.nextLine();
                                
                                if (qtdVenda <= 0) {
                                    System.out.println("[Erro] A quantidade deve ser maior que zero.");
                                } else if (qtdVenda > quantidades[indice]) {
                                    System.out.printf("[Erro] Estoque insuficiente! Restam apenas %d unidades.%n", quantidades[indice]);
                                } else {
                                    quantidades[indice] -= qtdVenda;
                                    double valorTotalVenda = qtdVenda * precosVenda[indice];
                                    
                                    double imposto = valorTotalVenda * (aliquotas[indice] / (100.0 + aliquotas[indice]));
                                    double receitaLiquida = valorTotalVenda - imposto;
                                    
                                    caixaDoDia += valorTotalVenda;
                                    totalImpostos += imposto;

                                    System.out.println("\n[Sucesso] Venda concluída!");
                                    System.out.printf("Valor total (com imposto): R$ %.2f%n", valorTotalVenda);
                                    System.out.printf("Receita líquida (sem imposto): R$ %.2f%n", receitaLiquida);
                                    System.out.printf("Imposto embutido (%.2f%%): R$ %.2f%n", aliquotas[indice], imposto);
                                }
                            }
                        } else {
                            System.out.println("[Erro] Número não encontrado na lista.");
                        }
                    }
                    break;

                case 2:
                    if (totalCadastrados >= MAX_PRODUTOS) {
                        System.out.println("\n[Erro] Estoque cheio!");
                    } else {
                        System.out.println("\n--- Cadastro de Produto ---");
                        
                        System.out.print("Nome do produto: ");
                        nomes[totalCadastrados] = scanner.nextLine();
                        while (nomes[totalCadastrados].trim().isEmpty()) {
                            System.out.print("[Erro] O nome não pode ser vazio. Digite novamente: ");
                            nomes[totalCadastrados] = scanner.nextLine();
                        }

                        System.out.print("Categoria [C] Cerveja | [V] Vinho | [D] Destilado | [O] Outra: ");
                        String entradaCat = scanner.nextLine().toUpperCase();
                        
                        if (entradaCat.equals("C")) { 
                            categorias[totalCadastrados] = "Cerveja";
                            aliquotas[totalCadastrados] = 18.0;
                        } else if (entradaCat.equals("V")) {
                            categorias[totalCadastrados] = "Vinho";
                            aliquotas[totalCadastrados] = 27.0;
                        } else if (entradaCat.equals("D")) {
                            categorias[totalCadastrados] = "Destilado";
                            aliquotas[totalCadastrados] = 18.0;
                        } else {
                            System.out.print("Digite o nome da nova categoria: ");
                            categorias[totalCadastrados] = scanner.nextLine();

                            System.out.print("Digite a taxa de imposto (%) para esta categoria: ");
                            while (!scanner.hasNextDouble()) {
                                System.out.print("[Erro] Digite um número válido para a taxa: ");
                                scanner.nextLine();
                            }
                            aliquotas[totalCadastrados] = scanner.nextDouble();
                            scanner.nextLine();
                        }

                        System.out.print("Preço de Compra (Custo) (R$): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("[Erro] Digite um valor de compra válido: ");
                            scanner.nextLine();
                        }
                        precosCompra[totalCadastrados] = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Preço de Venda Final (R$): ");
                        while (true) {
                            if (scanner.hasNextDouble()) {
                                double precoVendaDigitado = scanner.nextDouble();
                                scanner.nextLine();
                                if (precoVendaDigitado >= precosCompra[totalCadastrados]) {
                                    precosVenda[totalCadastrados] = precoVendaDigitado;
                                    break;
                                } else {
                                    System.out.printf("[Erro] Preço de venda deve ser maior ou igual ao custo (R$ %.2f): ", precosCompra[totalCadastrados]);
                                }
                            } else {
                                System.out.print("[Erro] Digite um número válido para o preço: ");
                                scanner.nextLine();
                            }
                        }

                        System.out.print("Quantidade atual em estoque: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("[Erro] Digite um número inteiro para a quantidade: ");
                            scanner.nextLine();
                        }
                        quantidades[totalCadastrados] = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Estoque mínimo (Alerta de reposição): ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("[Erro] Digite um número inteiro para o estoque mínimo: ");
                            scanner.nextLine();
                        }
                        estoquesMinimos[totalCadastrados] = scanner.nextInt();
                        scanner.nextLine();
                        
                        totalCadastrados++;
                        System.out.println("\n[Sucesso] Produto adicionado com sucesso!");
                    }
                    break;

                case 3:
                    if (totalCadastrados == 0) { 
                        System.out.println("\n[Aviso] Estoque vazio!"); 
                    } else {
                        System.out.println("\n=== ESTOQUE GERAL ===");
                        for (int i = 0; i < totalCadastrados; i++) {
                            double lucroUnitario = precosVenda[i] - precosCompra[i];
                            System.out.printf("%s (%s) | Qtd: %d | Imposto: %.2f%%%n", nomes[i], categorias[i], quantidades[i], aliquotas[i]);
                            System.out.printf("  -> Compra: R$ %.2f | Venda: R$ %.2f | Lucro por un.: R$ %.2f%n", precosCompra[i], precosVenda[i], lucroUnitario);
                        }
                    }
                    break;

                case 4:
                    if (totalCadastrados == 0) { 
                        System.out.println("\n[Aviso] Estoque vazio!"); 
                    } else {
                        System.out.println("\n=== ALERTA DE REPOSIÇÃO (ESTOQUE BAIXO) ===");
                        boolean temEstoqueBaixo = false;

                        for (int i = 0; i < totalCadastrados; i++) {
                            if (quantidades[i] <= estoquesMinimos[i]) {
                                temEstoqueBaixo = true;
                                System.out.printf("-> COMPRAR: %s | Atual: %d | Mínimo: %d%n", nomes[i], quantidades[i], estoquesMinimos[i]);
                            }
                        }
                        if (!temEstoqueBaixo) System.out.println("Todos os produtos estão com estoque em nível seguro.");
                    }
                    break;

                case 5:
                    if (totalCadastrados == 0) { 
                        System.out.println("\n[Aviso] Estoque vazio!"); 
                    } else {
                        System.out.println("\n=== EXCLUSÃO DE PRODUTO ===");
                        for (int i = 0; i < totalCadastrados; i++) {
                            System.out.printf("[%d] %s%n", i, nomes[i]);
                        }

                        System.out.print("\nDigite o NÚMERO do produto que deseja excluir (ou -1 para cancelar): ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("[Erro] Digite apenas um número válido da lista: ");
                            scanner.nextLine();
                        }
                        int idx = scanner.nextInt();
                        scanner.nextLine();

                        if (idx == -1) { 
                            System.out.println("Exclusão cancelada."); 
                        } else if (idx >= 0 && idx < totalCadastrados) {
                            System.out.printf("Tem certeza que deseja APAGAR '%s'? (S/N): ", nomes[idx]);
                            String confirmacao = scanner.nextLine();
                            
                            if (confirmacao.equalsIgnoreCase("S")) {
                                String nomeExcluido = nomes[idx];
                                for (int j = idx; j < totalCadastrados - 1; j++) {
                                    nomes[j] = nomes[j + 1];
                                    categorias[j] = categorias[j + 1];
                                    precosCompra[j] = precosCompra[j + 1];
                                    precosVenda[j] = precosVenda[j + 1];
                                    quantidades[j] = quantidades[j + 1];
                                    estoquesMinimos[j] = estoquesMinimos[j + 1];
                                    aliquotas[j] = aliquotas[j + 1];
                                }
                                totalCadastrados--;
                                System.out.printf("%n[Sucesso] '%s' foi removido permanentemente.%n", nomeExcluido);
                            } else {
                                System.out.println("\n[Aviso] Exclusão cancelada.");
                            }
                        } else {
                            System.out.println("[Erro] Código inválido. Escolha um número da lista.");
                        }
                    }
                    break;

                case 6:
                    if (totalCadastrados == 0) { 
                        System.out.println("\n[Aviso] Estoque vazio!"); 
                    } else {
                        System.out.println("\n=== FILTRO POR CATEGORIA ===");
                        System.out.print("Qual categoria você quer listar? (Cerveja, Vinho, Destilado...): ");
                        String busca = scanner.nextLine().trim();

                        boolean encontrou = false;
                        System.out.printf("%n--- Resultados para '%s' ---%n", busca);

                        for (int i = 0; i < totalCadastrados; i++) {
                            if (categorias[i].equalsIgnoreCase(busca)) {
                                encontrou = true;
                                System.out.printf("[%d] %s | Estoque: %d | Preço: R$ %.2f | Taxa: %.2f%%%n", i, nomes[i], quantidades[i], precosVenda[i], aliquotas[i]);
                            }
                        }
                        if (!encontrou) System.out.println("Nenhum produto cadastrado nessa categoria.");
                    }
                    break;
                
                case 7:
                    System.out.println("\n=== RELATÓRIO TRIBUTÁRIO ===");
                    System.out.printf("Total de impostos arrecadados: R$ %.2f%n", totalImpostos);
                    System.out.printf("Total em caixa (com impostos): R$ %.2f%n", caixaDoDia);
                    System.out.printf("Total líquido (sem impostos): R$ %.2f%n", caixaDoDia - totalImpostos);
                    break;

                case 8:
                    System.out.println("\nFechando o caixa... Até mais!");
                    break;

                default:
                    System.out.println("\n[Erro] Opção inválida! Escolha entre 1 e 8.");
                    break;
            }

        } while (opcao != 8);
        
        scanner.close();
    }
}