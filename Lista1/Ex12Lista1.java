//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex12Lista1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        double n = entry.nextDouble();

        double powerOfTwo = Math.pow(n,2.0);
        double powerOfThree = Math.pow(n,3.0);
        double powerOfTen = Math.pow(n,10.0);
        double squareRoot = Math.sqrt(n);

        System.out.println(n + " elevado ao quadrado é: " + powerOfTwo);
        System.out.println(n + " elevado ao cubo é: " + powerOfThree);
        System.out.println(n + " elevado a potência de 10 é: " + powerOfTen);
        System.out.printf("A raiz quadrada de %f é: %.3f", n, squareRoot);
        entry.close();
    }    
}
