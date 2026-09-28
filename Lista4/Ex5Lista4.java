package Lista4;
import java.util.Scanner;

public class Ex5Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = input.nextInt();
        int i = 1;
        int r;

        while(i <= n) {
            r = i * 5;
            System.out.printf("5 x %d = %d%n", i, r);
            i++;
        }
        input.close();
    }
}
