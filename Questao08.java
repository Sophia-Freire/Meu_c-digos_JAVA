import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		/* Uma determinada escola paga seus professores por hora/aula. Crie um algoritmo que
		   solicite ao usuário o nível e a quantidade de horas/aula, calcule e exiba na tela
		   o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        
        		 Professor Nível 1 R$12,00 por hora/aula
				 Professor Nível 2 R$17,00 por hora/aula
				 Professor Nível 3 R$25,00 por hora/aula
        
        */
		
			Scanner leia = new Scanner (System.in);
			
			int nivel;
			double qntd;
			
			System.out.println("Qual seu nivel?");
			nivel = leia.nextInt();
			
			System.out.println("Quantidade de horas?");
			qntd = leia.nextDouble();
			
			switch(nivel) {
			case 1: System.out.println(12.00 * qntd); break;
			case 2: System.out.println(17.00 * qntd); break;
			case 3: System.out.println(25.00 * qntd); break; 
			default:System.out.println("Nivel inserido não encontrado, tente novamente.");
			}
			 
				
	
		
		
		
	}

}
