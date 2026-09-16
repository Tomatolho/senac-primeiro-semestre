package Lista2;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira seu salário bruto: ");
        double salario = input.nextDouble();
        System.out.print("Insira o valor da prestação: ");
        double prestacao = input.nextDouble();
        
        double maxPrestacao = salario * 0.3;

        if (prestacao > maxPrestacao) {
            System.out.println("Empréstimo não pode ser concedido!");
            System.out.println("O máximo que pode ser concedido é R$" + maxPrestacao);
        } else {
            System.out.println("Empréstimo pode ser concedido!");
        }
        input.close();
    }    
}
