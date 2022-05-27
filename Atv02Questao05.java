import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		// 5) Crie um algoritmo que receba um número de ponto flutuante e calcule o seu cubo usando
		//a classe Math.
		 
		Scanner leia = new Scanner(System.in); 
		
		double pontoFlutuante; 
		
		System.out.println("Informe um número quebrado: ");
		 pontoFlutuante = leia.nextDouble();
		 
		 System.out.println(Math.pow(pontoFlutuante,3));
		 		
		
	}

}
