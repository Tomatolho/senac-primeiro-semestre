//Thomas Altman Souza
package Lista4;
import java.util.Scanner;

public class Ex7Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int idealWeight = 0;

        while(i <= 10) {
            System.out.print("Insira a altura: ");
            double height = input.nextFloat();
            System.out.print("Insira o peso: ");
            double weight = input.nextFloat();

            double imc = weight / Math.pow(height,2.0);

            System.out.printf("IMC: %.2f%n", imc);
            if (imc > 18.5 && imc < 24.9) {
                idealWeight++;
            }
            i++;
        }
        System.out.println(idealWeight + " pessoas estão no peso ideal");
        input.close();
    }
}
