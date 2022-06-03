import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		/* Faça um algoritmo que calcule o número de pontos acumulados por um time
		 * de futebol em um campeonato, dada a quantidade de vitórias e a quantidade de empates
		 * que o time tem até o momento. Considere que uma vitória vale 3 pontos e um 
		 * empate vale 1 ponto 
		 * 
		 */

		Scanner leia = new Scanner (System.in);
		
		// Vitória: 3 pontos
		// Empate: 1 ponto
		
		
		int vitoria;
		int empate;
		int pontos;
		
		System.out.print("Vitorias: ");
		vitoria = leia.nextInt();
		
		System.out.print("Empates: ");
		empate = leia.nextInt();
		
		
		System.out.println("O numero de pontos acumulados e: " +((vitoria * 3) + (empate * 1)));
		
		
		
	}

}
