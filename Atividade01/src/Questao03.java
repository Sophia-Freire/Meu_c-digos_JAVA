import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia 4 variáveis (a, b, c, e d), calcule e
		  mostre na tela o resultado da diferença do produto de a e b pelo produto de c e d.
		  Confira os exemplos abaixo.
			
			 DIFERENCA = (a * b - c * d).

		 */

			Scanner leia = new Scanner (System.in);
			
			int a, b, c, d, diferenca;
			
			System.out.println("informe o valore da seguinte variavel (a)");
			a = leia.nextInt();
			
			System.out.println("informe o valore da seguinte variavel (b)");
			b = leia.nextInt();
			
			System.out.println("informe o valore das seguinte variavel (c)");
			c = leia.nextInt();
			
			System.out.println("informe o valore das seguinte variavel (d)");
			d = leia.nextInt();
			
			diferenca = (a*b - c*d);
			
			System.out.println("A difernca do produto de " + a + " e  " + b + " pelo produto de" + c +  " e " + d + "e:" + diferenca);
			
	
	
	
	
	}
}
