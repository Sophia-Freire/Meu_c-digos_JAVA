import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		/* Crie um algoritmo que leia uma variável e some 10 caso seja par ou some 5 caso
		 * seja ímpar, após isso, imprima o resultado desta operação 
		 * 
		 */
			Scanner leia = new Scanner (System.in);
			
			int x;
			
			System.out.println("Informe um número");
			x = leia.nextInt();
			
			if (x %2 == 0) {
			System.out.println(	x = ( x + 10));	
			
			}else if (x != 0 ){
				System.out.println( x = ( x + 5));
			}
			
			
		
		
		
		
	}

}
