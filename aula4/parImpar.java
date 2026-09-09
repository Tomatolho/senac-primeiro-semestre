package aula4;
import java.util.Scanner;

public class parImpar {
    public static void main(Scanner[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        input.close();
    }
}
