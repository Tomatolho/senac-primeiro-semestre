package aula5;
import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double nota;
    
    do{
        System.out.print("Digite sua nota: ");
        nota = input.nextDouble();

        if (nota < 0 || nota > 10){
            System.out.println("Nota incorreta! O valor deve estar entre 0 e 10");
        }
    }while(nota < 0 || nota > 10);
    System.out.println("Nota valida registrada com sucesso " + nota);
    input.close();
    }
}
