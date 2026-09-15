package aula4;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        double n = input.nextDouble();

        if (n >= 50 && n <= 100 ) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }
        input.close();
    }
}
