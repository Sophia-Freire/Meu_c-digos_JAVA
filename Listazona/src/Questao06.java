import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		/*
		Uma empresa paga a seus funcionários R$ 1,00 de comissão para cada produto vendido,
		entretanto, se forem vendidos mais de 250 produtos, o valor aumenta para R$ 1,50. Se a
		quantidade for superior a 500 produtos, o valor da comissão sobe para R$ 2,00. Monte um
		programa para ler o nome de um funcionário e a quantidade de produtos que ele vendeu.
		Exiba o nome do funcionário e o total de comissão que ele vai receber.
		 
		 */
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int qntd;
		
		
		System.out.print("Nome: ");
		nome = leia.next();
		
		System.out.print("Quantidade vendida: ");
		qntd = leia.nextInt();
		
		
		if (qntd < 250) {
		System.out.println(nome + ", seu valor da comissao e: R$" +  (qntd * 1.0));		
			
		}else if (qntd >= 250){
			System.out.println(nome + ", seu valor da comissao e: R$" + (qntd * 1.50));			
			
		}else if ((qntd >= 250) || (qntd <= 500)) {
			System.out.println(nome + ", seu valor da comissao e: R$" + (qntd * 2.0));	
		}	
		
		
	}

}
