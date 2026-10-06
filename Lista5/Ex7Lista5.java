//Thomas Altman Souza
package Lista5;

import java.util.Scanner;
public class Ex7Lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qnt = 0, qntAlt = 0;
        double media = 0;
        double perc = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "ª pessoa");
            System.out.print("Insira a idade: ");
            int age = input.nextInt();
            
            System.out.print("Insira a altura: ");
            double height = input.nextDouble();
            
            System.out.print("Insira o peso: ");
            double weight = input.nextDouble();

            if (age > 50) {
                qnt++;
            }
            if (age >= 10 && age <= 20) {
                media += height;
                qntAlt++;
            }
            if (weight < 40) {
                perc++;
            }
        }
        if (qntAlt > 0) {
            media = media / qntAlt;
        }
        double percTotal = perc * 10;

        System.out.println("Quantidade de pessoas maiores de 50 anos: " + qnt);
        
        if (qntAlt > 0) {
            System.out.printf("Média das alturas 10 a 20 anos: %.2f%n", media);
        } else {
            System.out.println("Média das alturas 10 a 20 anos: Nenhuma pessoa registrada nessa faixa de idade.");
        }
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + percTotal + "%");

        input.close();
    }
}