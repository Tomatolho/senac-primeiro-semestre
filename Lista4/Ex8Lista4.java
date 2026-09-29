package Lista4;
import java.util.Scanner;

public class Ex8Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        int i = 1;
        
        while(i <= 5){
            double notaTotal = 0;
            int n = 1;
            while(n <= 2){
                do{
                    System.out.print("Insira a nota: ");
                    nota = input.nextDouble();

                    if(nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Insira novamente.");
                    }
                }while(nota < 0 || nota > 10);
                notaTotal = notaTotal + nota;
                n++; 
            }
            double media = notaTotal / 2;
            System.out.printf("A média do %d° aluno: %.2f%n", i, media);
            i++;
        }
        input.close();
    }
}
