package Lista3;
import java.util.Scanner;

public class Ex1Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int diaSemana = input.nextInt();

        switch(diaSemana) {
            
            case 1:
                System.out.println("Domingo");
            break;

            case 2:
                System.out.println("Segunda-feira");
            break;

            case 3:
                System.out.printl("Terça-feira");
            break;
            
            case 4:
                System.out.println("Quarta-feira");
            break;

            case 5:
                System.out.println("Quinta-feira");
            break;

            case 6:
                System.out.println("Sexta-feira");
            break;

            case 7:
                System.out.println("Sábado");
            break;
        }
    }
}
