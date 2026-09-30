package aula5;
import java.util.Scanner;

public class somaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        int age;
        int ageTotal = 0;

        for(i = 1; i <= 5; i++) {
            
            System.out.println("Insira a idade: ");
            age = input.nextInt();
            ageTotal += age;
        }
        System.out.println("Idade total: " + ageTotal);
    }
}