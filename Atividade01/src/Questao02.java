
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia o valor do raio de um círculo, calcule e mostre na 
		  tela o valor da área desse círculo utilizando 4 casas decimais.
		  
		  
			 Fórmula da área: area = π . raio2
			 Considere o valor de π = 3.14159
		*/
				
			Scanner leia = new Scanner (System.in);
		
			
			double area; 
			double raio;
		
			
			System.out.println("Qual o valor do raio?");
			raio = leia.nextDouble();
			
			
			area = (3.14159 * raio *2);
			
			System.out.printf("O valor da area é igual a:" + "%.4%n", area);
		
		
		

		
		
		
		
	}

}
