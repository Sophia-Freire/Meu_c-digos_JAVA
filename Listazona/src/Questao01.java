import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
	/*    (1.) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
	    	mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
			(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
   */
		
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias, resultado;
		int anos2, meses2, dias2;
		
		System.out.print("Informe a sua idade em anos:");
		anos = leia.nextInt();
		
		System.out.print("Informe a sua idade em meses:");
		meses = leia.nextInt();
		
		System.out.print("Informe a sua idade em dias");
		dias = leia.nextInt();
		
		anos2 = (anos * 365); 
		meses2 = (meses * 30);
		resultado = (anos2 + meses2 + dias);
		
		System.out.println("A sua idade em dia é igual a: " + resultado);
				
	

	}

}
