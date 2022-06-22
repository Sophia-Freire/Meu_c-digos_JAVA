import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
	/*11.Agora altere o algoritmo anterior de maneira que ele verifique também se o nível
	  informado está entre 0 e 10. Caso contrário uma mensagem de erro deve ser apresenta.
		*/
	

		Scanner leia = new Scanner (System.in);
		int nivel;
		
		System.out.println("B E M - V I N D O");
		System.out.println("");
		System.out.println("Detector de risco, por favor informe o nIvel (1 a 10)");
		nivel = leia.nextInt();
		
		if ((nivel == 9 ) || (nivel == 10)) {
			System.out.println("GRAVE");
		}else {
			System.out.println("nivel nao encontrado");
		}
		
		
	}
	
}
