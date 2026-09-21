//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class Ex4Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        float n1 = input.nextFloat();
        System.out.print("Digite outro valor: ");
        float n2 = input.nextFloat();

        if (n1 == n2) {
            System.out.println("Numeros iguais.");
        } else if (n1 < n2) {
            float temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.print(n1 + ", " + n2);
    input.close();
    }
}
