package aula4;
import java.util.Scanner;

public class adivinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu palpite: ");
        int palpite = input.nextInt();

        if (palpite == 15) {
            System.out.println("Parabens voce acertou! O número secreto era 15.");
            
        }
        input.close();
    }
}
