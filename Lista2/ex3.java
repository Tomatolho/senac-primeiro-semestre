//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else if (n1 > n2) {
            System.out.printf("%d maior que %d diferença de %d.%n", n1, n2, n1 - n2);
        } else {
            System.out.printf("%d maior que %d diferença de %d.%n", n2, n1, n2 - n1);
        }
        input.close();
    }
}
