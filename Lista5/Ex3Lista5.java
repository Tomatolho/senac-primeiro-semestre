//Thomas Altman Souza
package Lista5;

import java.util.Scanner;
public class Ex3Lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int c = input.nextInt();

        System.out.print("Sequência: ");

        for(int i = 1; i <= c; i++) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
