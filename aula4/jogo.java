package aula4;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pontos do jogador 1 na fase 1: ");
        Double points = input.nextDouble();

        if (points >= 1000) {
            System.out.println("Parabens! Você passou para a fase 2");
        } else {
            System.out.println("Você não atingiu a pontuação necessária");
        }
        System.out.println("Siga para a próxima etapa");
        input.close();
    }
}
