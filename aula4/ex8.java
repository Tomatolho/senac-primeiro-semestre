package aula4;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String password = input.nextLine();

        if (password.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
        input.close();
    }
}
