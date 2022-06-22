import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
	/*.
	Crie um algoritmo que, dado o nível de alerta de risco, imprima se ele for GRAVE. O nível de
	alerta é um número que varia de 0 a 10. O nível é considerado GRAVE quando ele é superior a 9.
	*/
		
		Scanner leia = new Scanner (System.in);
		int nivel;
		
		System.out.println("B E M - V I N D O");
		System.out.println("");
		System.out.println("Detector de risco, por favor informe o nIvel (1 a 10)");
		nivel = leia.nextInt();
		
		if ((nivel == 9 ) || (nivel == 10)) {
			System.out.println("GRAVE");
		}
		
		
	}
	

}
