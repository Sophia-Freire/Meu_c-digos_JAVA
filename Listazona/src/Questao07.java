import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		/*Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um
		financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o salário da
		pessoa, o algoritmo deverá escrever "Financiamento Concedido"; senão, ele deverá
		escrever "Financiamento Negado". Independente de conceder ou não o financiamento, o
		algoritmo escreverá depois a frase "Obrigado por nos consultar."
*/

		Scanner leia = new Scanner (System.in);
		
		double sal, fin;
		
		System.out.print("Salario: ");
		sal = leia.nextDouble();
		
		System.out.print("Valor do financiamento: ");
		fin = leia.nextDouble();
		
		if (fin < 5 * sal) {
			System.out.println("Financiamento concedido");
		}else {
			System.out.println("Financiamento negado");
		}
		
	}

}
