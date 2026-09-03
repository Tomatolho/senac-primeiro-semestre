//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex9Lista1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota: ");
        double n1 = entry.nextDouble();
        
        System.out.print("Insira a segunda nota: ");
        double n2 = entry.nextDouble();
        
        System.out.print("Insira a terceira nota: ");
        double n3 = entry.nextDouble();
        
        System.out.printf("(%.2f + %.2f + %.2f) / 3 = %.2f%n", n1, n2, n3, (n1 + n2 + n3) / 3);
        entry.close();
    }
}
