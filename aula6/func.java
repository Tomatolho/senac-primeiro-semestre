//Funcao sem retorno e sem parametros
package aula6;

public class func {
    public static void main(String[] args) {
        System.out.println("Antes de chamar o método");
        informacoes();
        System.out.println("Depois de chamar o método");
        informacoes();
    }
    public static void informacoes() {
        System.out.println("==============");
        System.out.println("Michel calvo");
        System.out.println("==============");
    }
}
