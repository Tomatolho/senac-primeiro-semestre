package aula4;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira sua altura em metros: ");
        float height = input.nextFloat();

        System.out.print("Insira o seu sexo M para masculino ou F para feminino: ");
        char gender = input.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.printf("O peso ideal para o sexo masculino é de: %.1f Kg", (72.7 * height) - 58);
        } else if (gender == 'F' || gender == 'f') {
            System.out.printf("O peso ideal para o sexo feminino é de: %.1f Kg", (62.1 * height) - 44.7);
        }
        input.close();
    }
}
