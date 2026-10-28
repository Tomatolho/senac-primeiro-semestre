package aula6;
import java.util.Random;

public class aleat {
    public static void main(String[] args) {
        Random random = new Random();
        int sort = 10 + random.nextInt(90 + 1);
        System.out.println(sort);
    }
}
