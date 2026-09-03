//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex8Lista1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int n1 = entry.nextInt();
        System.out.print("Insira outro valor: ");
        int n2 = entry.nextInt();
        System.out.printf("%d + %d = %d%n", n1, n2, n1 + n2);
        entry.close();
    }
}
