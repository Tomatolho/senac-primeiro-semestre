//Thomas Altman Souza
package Lista5;
import java.util.Scanner;

public class Ex4Lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        int c = 0;
        double totalHeight = 0;

        for(int i = 1; i <= 10; i++) {
            double height = 0;
            System.out.print("Insira a idade: ");
            age = input.nextInt();
            System.out.print("Insira a altura: ");
            height = input.nextDouble();

            if(age > 50) {
                totalHeight += height;
                c++;
            }
        }
        if(c > 0) {
            double media = totalHeight / c;
            System.out.println("Média de altura das pessoas com mais de 50 anos: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos registrada");
        }
        input.close();
    }
}