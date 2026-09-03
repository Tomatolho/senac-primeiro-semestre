//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex15Lista1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Ano em que nasceu: ");
        int birthYear = entry.nextInt();
        
        System.out.print("Ano atual: ");
        int currentYear = entry.nextInt();

        int age = currentYear - birthYear;
        int ageIn2030 = 2030 - birthYear;
        
        System.out.println("Sua idade: " + age + " anos");
        System.out.println("Em 2030 você terá: " + ageIn2030 + " anos");
        entry.close();
    }
}