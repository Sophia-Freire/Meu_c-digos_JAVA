import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia uma vogal informada pelo usuário e imprima na tela
		 * três nomes próprios de sua escolha que inicia, com essa vogal. Utilize a estrutura 
		 * Switch.
		 */

		
		Scanner leia = new Scanner (System.in);
        
		char vog;
		
		System.out.println("Qual a vogal desejada? ");
		vog = leia.next().charAt(0);
		
		switch(vog) {
		case 'a': System.out.println("Alice, Ariany, Anna"); break;
		case 'e': System.out.println("Emanoel, Elias, Eliane"); break;
		case 'i': System.out.println("Icaro, Isaac, Iara"); break;
		case 'o': System.out.println("Oslavo, Olivia, Otavio"); break;
		case 'u': System.out.println("Uriel, Uanne, Ursula"); break;
		
		}
		
		
		
		
	}

}
