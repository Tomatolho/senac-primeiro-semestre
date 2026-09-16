//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        Double n = input.nextDouble();
        
        if (n > 20) {
            n = n / 2;
        }
        System.out.print(n);
        input.close();
    }
}
