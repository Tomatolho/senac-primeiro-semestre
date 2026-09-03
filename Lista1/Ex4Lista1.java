//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex4Lista1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int n1 = entry.nextInt();
        System.out.print("Insira o segundo valor: ");
        int n2 = entry.nextInt();
        System.out.print("Insira o terceiro valor: ");
        int n3 = entry.nextInt();
        System.out.print("Insira o quarto valor: ");
        int n4 = entry.nextInt();
        
        System.out.printf("%d + %d + %d + %d = %d%n", n1, n2, n3, n4, n1 + n2 + n3 + n4);
        entry.close();
    }
}
