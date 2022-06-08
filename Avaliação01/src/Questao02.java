import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia um número x inteiro e mostre o seu antecessor e sucessor
		
		Scanner leia = new Scanner (System.in);
		
		int x, ant, sus;
		
		System.out.print("Informe um numero:");
		x = leia.nextInt();
		
		ant = (x - 1);
		sus = (x + 1);
		
		System.out.println("O antecessor de " + x + " e igual a " + ant + " e o sucessor e igual a " + sus);
		

	}

}
