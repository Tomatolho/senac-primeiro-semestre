//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class Ex2Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Idade: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        input.close();
    }
}
