import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia dois números inteiros, calcule e mostre na tela a soma
		//deles com uma mensagem informando a operação realizada.
		
		Scanner leia = new Scanner (System.in);
		
		int x;
		int y;
		int resultado; 
		
		System.out.println("Informe um numero:");
		x = leia.nextInt();
		System.out.println("Informe mais um numero:");
		y = leia.nextInt();
		
		resultado = ( x + y);
		
		System.out.println("A soma e igual a: " + resultado);
		
		
		
		
	}

}
