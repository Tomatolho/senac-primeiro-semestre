package aula3;
import java.util.Scanner;

public class aula3Algoritmo {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);

        System.out.print("Numero maior que 10?: ");
        Integer n1 = entry.nextInt();

        boolean r1 = (n1 > 10);
        boolean r2 = !(r1);
        
        System.out.println(r1);
        System.out.println(r2);

        entry.close();
    }
}
