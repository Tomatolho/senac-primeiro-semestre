package aula5;
import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        int resto;

        System.out.print("Digite um número");
        int n1 = input.nextInt();

        while (contador <= n1) {
            resto = contador % 2;
                if (resto == 0) {
                    System.out.println(contador);
                }
            contador++;
        }
        input.close();
    }
}