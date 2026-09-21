//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class Ex13Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float n1 = input.nextFloat();

        System.out.print("Digite o sinal da operação (+, -, *, /): ");
        char operacao = input.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        float n2 = input.nextFloat();

        if (operacao == '+') {
            float resultado = n1 + n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '-') {
            float resultado = n1 - n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '*') {
            float resultado = n1 * n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '/') {
            if (n2 > 0) {
                float resultado = n1 / n2;
                System.out.printf("%.2f / %.2f = %.2f", n1, n2, resultado);
            } else {
                System.out.println("Impossível dividir!");
            }
        } else {
            System.out.println("Sinal Inválido");
        }
        input.close();
    }
}