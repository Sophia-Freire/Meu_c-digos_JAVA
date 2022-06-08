import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// Crie um algoritmo que leia 3 números e verifique se o primeiro é maior que
		// a soma dos dois últimos
		
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.print("Informe um numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Informe um numero: ");
		n2 = leia.nextInt();
		
		System.out.print("Informe um numero: ");
		n3 = leia.nextInt();
		
		
		if ( n1 > (n2 + n3)  ) {
			System.out.println("O primeiro numero e maior");
		} else if ( n1 < ( n2 + n3)) {
			System.out.println("O primerio numero nao e maior");
		}
		
		
		
		
		
		
		

	}

}
