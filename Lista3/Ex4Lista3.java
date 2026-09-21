//Thomas Altman Souza
package Lista3;
import java.util.Scanner;

public class Ex4Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu plano de trabalho");
        System.out.println("Plano              Aumento");
        System.out.println(" [A]                  10%");
        System.out.println(" [B]                  15%");
        System.out.println(" [C]                  20%");
        char plano = input.next().toUpperCase().charAt(0);
        
        System.out.print("Insira seu salário: ");
        float sala = input.nextFloat();
        
        float salanovo = 0;

        switch(plano) {
            case 'A':
                salanovo = sala + (sala * 0.1f);
                System.out.println("Salário atualizado: " + salanovo);
            break;

            case 'B':
                salanovo = sala + (sala * 0.15f);
                System.out.println("Salário atualizado: " + salanovo);
            break;

            case 'C':
                salanovo = sala + (sala * 0.2f);
                System.out.println("Salário atualizado: " + salanovo);
            
            default:
                System.out.println("Plano de trabalho inválido!");
        }
        input.close();
    }
}