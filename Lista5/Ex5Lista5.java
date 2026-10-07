//Thomas Altman Souza
package Lista5;

import java.util.Scanner;
public class Ex5Lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double media = 0, mediaTotal = 0;
        int rep = 0, exa = 0, apr = 0;

        for(int i = 1; i <= 6; i++) {
            double notasAluno = 0;
            for(int c = 1; c <= 2;) {
                    System.out.print("Insira a " + c + "ª nota: ");
                    double nota = input.nextDouble();
                    if(nota >= 0 && nota <= 10) {
                        notasAluno += nota;
                         c++;
                    } else {
                        System.out.println("Nota inválida!");
                    }
            }
            media = notasAluno / 2;
            mediaTotal += media;
            System.out.println("Média = " + media);

            if(media <= 3) {
                System.out.println("Reprovado");
                rep++;
            } else if(media > 3 && media < 7) {
                System.out.println("Exame");
                exa++;
            } else if (media >= 7) {
                System.out.println("Aprovado");
                apr++;
            }
        }
        System.out.println("Aluno aprovados: " + apr);
        System.out.println("Alunos de exame: " + exa);
        System.out.println("Alunos reprovados: " + rep);
        
        double mediaClasse = mediaTotal / 6;
        System.out.printf("Média da classe: %.2f%n", mediaClasse); 
        
        input.close();
    }
}