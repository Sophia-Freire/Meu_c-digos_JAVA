import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		/* Crie um algoritmo que leia dois valores informados pelo usuário e também qual operação
ele deseja executar (soma, subtração, divisão, multiplicação). Realize o cálculo e imprima o
resultado na tela.*/
		
		Scanner leia = new Scanner (System.in);
		 int n1;
		 int n2;
		 int operacao;
		 System.out.println("___C A L C U L A D O R A___");
		 
		System.out.print("Informe um numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Informe outro numero: ");
		n2 = leia.nextInt();
		
		System.out.println("Qual a operacao que voce deseja? (1-soma, 2-subtracao, 3-divisao, 4-multiplicao");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1: System.out.println("A soma entre " + n1 + " e " + n2 + " e: " + (n1 + n2));break;
		case 2: System.out.println("A subtracao entre " + n1 + " e " + n2 + " e: " + (n1 - n2));break;
		case 3: System.out.println("A divisao entre " + n1 + " e " + n2 + " e: " + (n1 / n2));break;
		case 4: System.out.println("A multiplicacao entre " + n1 + " e " + n2 + " e: " + (n1 * n2));break;
		default: System.out.println("Operacao nao encontrada, tente novamente");
		}
	
		
		
		
		
		
		
		
	}

}
