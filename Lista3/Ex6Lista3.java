//Thomas Altman Souza
package Lista3;
import java.util.Scanner;

public class Ex6Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Código     Produto        Preço");
        System.out.println("100     Cachorro Quente   R$ 1,20");
        System.out.println("101     Bauru Simples     R$ 1,30");
        System.out.println("102     Bauru com Ovo     R$ 1,50");
        System.out.println("103     Hambúrguer        R$ 1,20");
        System.out.println("104     Cheeseburguer     R$ 1,30");
        System.out.println("105     Refrigerante      R$ 1,00");
        System.out.print("Insira o código do produto: ");
        int id = input.nextInt();

        System.out.print("Insira a quantidade: ");
        int qnt = input.nextInt();

        double preco = 0;
        switch(id) {
            case 100:
                preco = 1.2 * qnt;
                System.out.println("Cachorro Quente");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            case 101:
                preco = 1.3 * qnt;
                System.out.println("Bauru Simples");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            case 102:
                preco = 1.5 * qnt;
                System.out.println("Bauru com Ovo");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            case 103:
                preco = 1.2 * qnt;
                System.out.println("Hambúrguer");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            case 104:
                preco = 1.3 * qnt;
                System.out.println("Cheeseburguer");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            case 105:
                preco = 1.0 * qnt;
                System.out.println("Refrigerante");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            break;

            default:
                System.out.println("Código do produto inválido!");
        }
        input.close();
    }
}