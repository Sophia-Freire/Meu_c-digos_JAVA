import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		//Ler os nomes e os pesos de duas pessoas e imprimir os dados da pessoa mais gorda.

		Scanner leia = new Scanner (System.in);
		
		String no1, no2;
		int peso1, peso2;
		
		System.out.print("Nome: ");
		no1 = leia.next();
		
		System.out.print("Peso: ");
		peso1 = leia.nextInt();
		
		System.out.println("");
		
		System.out.print("Nome: ");
		no2 = leia.next();
		
		System.out.print("Peso: ");
		peso2 = leia.nextInt();
		
		if (peso1 > peso2) {
			System.out.println(no1 + " e mais gordo (a)");
		}else {
			System.out.println(no2 + " e mais gordo (a)");
		}
		
		
		
	}

}
