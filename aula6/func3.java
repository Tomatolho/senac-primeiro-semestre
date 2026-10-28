package aula6;

public class func3 {
    public static void main(String[] args) {
        System.out.println("Realizando calculo com dois numeros");
        calcular(50, 10);
        System.out.println("Fim do calculo");
    }
    public static void calcular(int n1, int n2) {
        int resultado = ((n1 * n2) - (n1 + n2)) / (n1 - n2);
        System.out.println("Resultado: " + resultado);
    }
}
