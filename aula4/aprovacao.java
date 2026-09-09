package aula4;
import java.util.Scanner;

public class aprovacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = input.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = input.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float n3 = input.nextFloat();
        System.out.print("Digite o numero de presenças: ");
        int presencas = input.nextInt();

        float media = (n1 + n2 + n3) / 3;
        float frequencia = (presencas/21f) * 100;

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aprovado");
        } else if (media <= 6 && frequencia >= 75) {
            System.out.println("Prova Substitutiva");
        } else {
            System.out.println("Reprovado");
        }
        input.close();
    }
}
