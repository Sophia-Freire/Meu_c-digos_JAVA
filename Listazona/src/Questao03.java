import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// Ler o nome de 2 times e o número de gols marcados na partida. Escrever o nome do
		//vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
			Scanner leia = new Scanner (System.in);
			
			String t1, t2;
			int g1, g2;
			
			System.out.print("Primeiro time: ");
				t1 = leia.next();
				
			System.out.print("Segundo time: ");	
				t2 = leia.next();
				
			System.out.print("Gols marcados na partida pelo " + t1 + "?" );	
				g1 = leia.nextInt();
				
			System.out.print("Gols marcados na partida pelo " + t2 + "?");	
				g2 = leia.nextInt();
				
				if (g1 > g2) {
					System.out.println(t1 + " Venceu");
				}else if (g2 > g1) {
					System.out.println(t2 + " Venceu");
				}else if (g1 == g2) {
					System.out.println(" Empate");
				}
				
				
				
				
	}

}
