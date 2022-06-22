import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
		forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
		compradas, calcule e escreva o custo total da compra.
*/
			Scanner leia = new Scanner (System.in);
			
			double qntd, resul;
			
			System.out.print("Quantas macas voce deseja?");
			qntd = leia.nextDouble();
			
			if (qntd <= 6) {
				resul = (qntd * 1.30);
				System.out.print("Valor = " + resul);
			}else if (qntd <= 12) {
				resul = (qntd * 1.00);
				System.out.print("Valor = " + resul);
			}
		
	}

}
