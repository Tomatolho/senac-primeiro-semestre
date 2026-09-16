package aula5;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========Menu de Opções=========");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Sair do Sistema");
        System.out.println("======Escolha uma das Opções======");

        int menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("Você escolheu o menu 1");
                System.out.println("Que é a opção de Cadastrar Produtos");
            break;
            
            case 2:
                System.out.println("Você escolheu o menu 2");
                System.out.println("Que é a opção Listar Produtos");
            break;
            
            case 3:
                System.out.println("Você escolheu o menu 3");
                System.out.println("Que é a opção sair do Sistema");
            break;
            
            default:
            System.out.println("Item de menu inválido");
        }
        input.close();
    }
}
