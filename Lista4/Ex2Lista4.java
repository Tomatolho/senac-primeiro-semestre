package Lista4;
import java.util.Scanner;

public class Ex2Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int n;
        int resto;
        int par = 0;
        int impar = 0;

        while(i <= 10) {
            System.out.println("Digite o " + i + "° número");
            n = input.nextInt();
            resto = n % 2;
            if(resto == 0) {
                par++;
            } else {
                impar++;
            }
            i++;
        }
        System.out.println("O total de pares é: " + par);
        System.out.println("O total de impares é: " + impar);
        
        input.close();
    }
}
