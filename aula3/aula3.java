package aula3;
import java.util.Scanner;

public class aula3 {
    public static void main(String[] args){
    
        Scanner entry = new Scanner(System.in);
    
    System.out.print("Type a value: ");
    Integer n1 = entry.nextInt();
    
    System.out.print(n1);
    entry.close();
    }
}