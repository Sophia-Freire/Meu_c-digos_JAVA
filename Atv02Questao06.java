import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// Escreva um programa que receba o nome e o sexo do usuário e, de acordo com o sexo,
		//imprima "Olá, Senhor <Nome>" ou "Olá, Senhora <Nome>".
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char sexo;
		
		System.out.println("Informe o seu nome:");
		 nome = leia.nextLine();
		  System.out.println("Informe seu sexo (M para masculino, F para feminino:");
		sexo = leia.next().charAt(0);
		
		System.out.println("Informe seu sexo ( M para masculino, F para feminino)");
		 sexo = leia.next().charAt(0); 
		if (sexo == 'M'){
			System.out.println("Ola senhor" + nome);	
		}else if (sexo == 'F'){
			System.out.println("Ola senhora" + nome);
			{
				
			}
		}
		
		
			}
	}
	

