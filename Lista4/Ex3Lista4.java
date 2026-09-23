package Lista4;
import java.util.Scanner;

public class Ex3Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int q = input.nextInt();
        int i = 1;
        double n = 1;
        while (i <= q) {
            System.out.print(n + ", ");
            n = Math.pow(2.0, i);
            i++;
        }
        
        input.close();
    }
}
