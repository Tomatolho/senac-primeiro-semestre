//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Possui cidadania brasileira? (S/N): ");
        char cidadania = input.next().toUpperCase().charAt(0);
        System.out.print("O título de eleitor está regularizado? (S/N): ");
        char tEleitor = input.next().toUpperCase().charAt(0);
        System.out.print("Digite a idade: ");
        int age = input.nextInt();

        if (cidadania == 'S' && tEleitor == 'S') {
            if (age >= 18 && age <= 70) {
                System.out.println("A pessoa está apta a votar e o voto é obrigatório");
            } else if ((age >= 16 && age < 18) || age > 70) {
                System.out.println("A pessoa está apta a votar o voto é facultativo ");
            } else {
                System.out.println("A pessoa não tem idade para votar");
            }

        } else {
            System.out.println("A pessoa não está apta a votar");
            System.out.println("Motivo: Necessário ter cidadania ativa e titulo eleitoral regularizado");
        }
        input.close();
    }
}