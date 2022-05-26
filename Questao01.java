import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
     /* 1) Crie um algoritmo que solicite ao usuário três números inteiros. Imprima na tela qual
       é o maior e o menor.
      */
		Scanner leia = new Scanner (System.in);
		
		int maior;
		int menor;
		
		System.out.println("Informe um numero");
		int n1 = leia.nextInt();
		maior = n1;
		menor = n1;
		
		System.out.println("Informe outro numero");
		int n2 = leia.nextInt();
		
		System.out.println("Informe mais um numero");
		int n3 = leia.nextInt();
		
		if (maior < n2) {
			maior = n2;
		}else{
			maior = n3;
		}
		
		
		if (menor > n2) {
			menor = n2;
		}else{
			menor = n3;
		}
		
		
		System.out.println("O número maior é:" + maior);
		System.out.println("O número menor é:" + menor);
		
		
		

	}

}
