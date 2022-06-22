import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		/*
	 12.Agora altere o algoritmo anterior de maneira que ele verifique os demais níveis de alerta.
		Considere: 0-3 é "BAIXO", maior que 3 até 6 "MÉDIO", maior que 6 até 9 "ALTO", para os
		demais casos é considerado "GRAVE".
		 */
		

		Scanner leia = new Scanner (System.in);
		int nivel;
		
		System.out.println("B E M - V I N D O");
		System.out.println("");
		System.out.println("Detector de risco, por favor informe o nIvel (1 a 10)");
		nivel = leia.nextInt();
		
		if ((nivel >= 0) && (nivel < 3)) {
			System.out.println("BAIXO");
		}else if ((nivel >= 3) && (nivel <= 5)) {
			System.out.println("MEDIO");
		}else if ((nivel >= 6) && (nivel <= 9)) {
			System.out.println("ALTO");
		}else {
			System.out.println("GRAVE");
		}
		
		
		
		
		
		
		
		
	}

}
