package Lista2;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maior;

        System.out.print("Insira o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = input.nextInt();
        System.out.print("Insira o terceiro número: ");
        int n3 = input.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.print("Os números são iguais");
            } else {
                if (n1 >= n2 && n1 >= n3) {
                maior = n1;
                } else if (n2 >= n1 && n2 >= n3) {
                maior = n2;
                } else {
                maior = n3;
                }
            System.out.println("O maior número é: " + maior); 
        }
        input.close();
    }
}