//Thomas Altman Souza
package Lista3;
import java.util.Scanner;

public class Ex5Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double n1 = input.nextDouble();
        System.out.print("Insira outro número: ");
        double n2 = input.nextDouble();

        System.out.println("Escolha a operação");
        System.out.println("[M] Média entre os números");
        System.out.println("[S] Diferença do maior pelo menor");
        System.out.println("[P] Produto entre os números digitados");
        System.out.println("[D] Divisão do primero pelo segundo");
        char opera = input.next().toUpperCase().charAt(0);

        switch(opera) {
            case 'M':
                System.out.printf("Média: (%.2f + %.2f) / 2 = %.2f%n", n1, n2, (n1 + n2) / 2);
            break;

            case 'S':
                if(n2 > n1) {
                    System.out.printf("Diferença: %.2f - %.2f = %.2f%n", n2, n1, n2 - n1);
                } else {
                    System.out.printf("Diferença: %.2f - %.2f = %.2f%n", n1, n2, n1 - n2);
                }
            break;

            case 'P':
                System.out.printf("Produto: %.2f * %.2f = %.2f", n1, n2, n1 * n2);
            break;

            case 'D':
                if(n2 != 0) {
                    System.out.printf("Divisão: %.2f / %.2f = %.2f", n1, n2, n1 / n2);
                } else {
                    System.out.print("Impossível dividir por 0");
                }
            break;

            default:
                System.out.println("Entrada inválida!");
        }
        input.close();
    }
}