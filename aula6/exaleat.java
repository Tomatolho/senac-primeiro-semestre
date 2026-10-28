package aula6;
import java.util.Random;

public class exaleat {
    public static void main(String[] args) {
    Random random = new Random();
    int menor = 10;
    for(int i = 1; i <= 10; i++) {
        int rand = 1 + random.nextInt(10 + 1);
        System.out.println(rand);
        
        if(rand < menor) {
            menor = rand;
        }
    }
    System.out.println("Menor: " + menor);
    }
}
