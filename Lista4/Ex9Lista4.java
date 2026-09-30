package Lista4;
import java.util.Scanner;

public class Ex9Lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeProduto = "";
        double preco = 0;
        boolean cont = false;
        
        System.out.println("Código     Produto        Preço");
        System.out.println("100     Cachorro Quente   R$ 1,20");
        System.out.println("101     Bauru Simples     R$ 1,30");
        System.out.println("102     Bauru com Ovo     R$ 1,50");
        System.out.println("103     Hambúrguer        R$ 1,20");
        System.out.println("104     Cheeseburguer     R$ 1,30");
        System.out.println("105     Refrigerante      R$ 1,00");

        do{
            System.out.print("Insira o código do produto: ");
            int id = input.nextInt();

            switch(id){
                case 100:
                    nomeProduto = "Cachorro Quente";
                    preco = 1.2;
                break;

                case 101:
                    nomeProduto = "Bauru Simples";
                    preco = 1.3;
                break;

                case 102:
                    nomeProduto = "Bauru com ovo";
                    preco = 1.5;
                break;

                case 103:
                    nomeProduto = "Hambúrguer";
                    preco = 1.2;
                break;

                case 104:
                    nomeProduto = "Cheeseburguer";
                    preco = 1.3;
                break;

                case 105:
                    nomeProduto = "Refrigerante";
                    preco = 1;
                break;

                default:
                    System.out.println("ID inválido");
            }
            System.out.println("Insira a quantidade de " + nomeProduto);

            
        }while(true);
    }
}
