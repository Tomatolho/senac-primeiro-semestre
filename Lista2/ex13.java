//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.print("Digite o sinal da operação (+, -, *, /): ");
        char operacao = input.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if (operacao == '+') {
            double resultado = n1 + n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '-') {
            double resultado = n1 - n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '*') {
            double resultado = n1 * n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        } else if (operacao == '/') {
            if (n2 > 0) {
                double resultado = n1 / n2;
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