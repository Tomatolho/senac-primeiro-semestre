//Thomas Altman Souza
package Lista5;

import java.util.Scanner;
public class Ex6Lista5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int votoNulo = 0, votoBranco = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Insira o voto: ");
            int voto = input.nextInt();
            switch(voto) {
                case 1:
                    c1++;
                break;
            
                case 2:
                    c2++;
                break;
            
                case 3:
                    c3++;
                break;

                case 4:
                    c4++;
                break;

                case 5:
                    votoNulo++;
                break;

                case 6:
                    votoBranco++;
                break;

                default:
                    System.out.println("Candidato inválido!");
                    i--;
            }
        }
        
        double percNone = (votoNulo + votoBranco) * 10;
        
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");
        System.out.println("Candidato 4: " + c4 + " votos");
        System.out.println("Nulos: " + votoNulo + " votos");
        System.out.println("Branco: " + votoBranco + " votos");
        System.out.println("Votos brancos e nulos: " + percNone + "%");

        input.close();
    }
}
