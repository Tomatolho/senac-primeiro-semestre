//Thomas Altman Souza
package Lista2;
import java.util.Scanner;

public class Ex11Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a idade do nadador: ");
        int age = input.nextInt();

        if (age >= 5 && age <= 7){
            System.out.println("Categoria Infantil A");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Categoria Infantil B");
        } else if (age >= 11 && age <= 13) {
            System.out.println("Categoria Juvenil A");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Categoria Juvenil B");
        } else if (age >= 18) {
            System.out.println("Categoria Sênior");
        } else {
            System.out.println("Muito novo, não existem categorias para esta idade");
        }
        input.close();
    }
}
