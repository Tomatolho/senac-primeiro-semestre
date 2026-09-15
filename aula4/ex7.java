package aula4;
import java.util.Scanner;

public class ex7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o salário: ");
        double salario = input.nextDouble();
        System.out.print("Insira quantos anos de empresa: ");
        int anos = input.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.2;
            salario = salario + bonus;
        } else {
            bonus = salario * 0.1;
            salario = salario + bonus;
        }
        System.out.printf("Bônus: R$%.2f%nSalário com bônus: R$%.2f%n", bonus, salario);
        input.close();  
    }
}