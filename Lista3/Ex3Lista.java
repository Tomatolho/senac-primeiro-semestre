//Thomas Altman Souza
package Lista3;
import java.util.Scanner;

public class Ex3Lista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o período do dia");
        System.out.println("M. Matutino");
        System.out.println("V. Vespertino");
        System.out.println("N. Noturno");
        char periodo = input.next().toUpperCase().charAt(0);

        switch(periodo) {
            case 'M':
                System.out.println("Bom dia!");
            break;

            case 'V':
                System.out.println("Boa tarde!");
            break;

            case 'N':
                System.out.println("Boa noite!");
            break;

            default:
                System.out.println("Período inválido!");
        }
        input.close();
    }
}