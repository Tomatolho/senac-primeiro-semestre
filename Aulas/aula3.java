import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer n1 = entry.nextInt();
        System.out.print("Digite um número: ");
        Integer n2 = entry.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int rand = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println(rand);

        entry.close();
    }
}