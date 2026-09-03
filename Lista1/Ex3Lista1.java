//Thomas Altman Souza
package Lista1;

import java.util.Scanner;

public class Ex3Lista1 {
	public static void main(String[] args) {		
		Scanner entry = new Scanner(System.in);

		System.out.print("Insira um valor inteiro: ");
		int n1 = entry.nextInt();
		System.out.print("Insira outro valor inteiro: ");
		int n2 = entry.nextInt();
		
		System.out.printf("%d x %d = %d%n", n1, n2, n1 * n2);
		entry.close();
	}
}