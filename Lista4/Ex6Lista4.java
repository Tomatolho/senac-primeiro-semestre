package Lista4;
import java.util.Scanner;

public class Ex6Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int n;
        int menor = 0;

        while(i <= 10) {
            do {
                System.out.print("Insira um número positivo: ");
                n = input.nextInt();

                if(n < 0) {
                    System.out.println("Número inválido! Insira um numero positivo.");
                }   
            } while(n < 0);
            if (i == 1) {
                menor = n;
            } else if(n < menor) {
                menor = n;
            }
            i++;
        }
        System.out.print("Menor número inserido: " + menor);
        input.close();
    }    
}
