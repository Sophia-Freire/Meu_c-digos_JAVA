import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		/* 3) Escreva um algoritmo em java que solicite ao usuário o código do produto e 
		  com base nesse código imprima onde ele foi fabricado, de acordo com a tabela abaixo:
		  
		 código 1: Salgueiro
		 código 2: Serrita
		 código 3: Recife
		 código 4: cabrobó
		 código 5 ou 6: Petrolina
		 Código 7, 8 ou 9: Santa maria da boa vista
		 código 10: Orocó
		 código 11: Lagoa Grande
		 
		 OBS: Se o código informado não conrresponder a nenhum dos apresentados acima, o
		  produto foi fabricado na China 
		 
		 */
		
		Scanner leia = new Scanner(System.in);
		int codigo;
		
		System.out.println("Informe o codigo:");
		codigo = leia.nextInt();
		
		
				
		if (codigo == 1) {
			System.out.println("Produto Fabricado em Salgueiro");	
		}else if(codigo == 2) {
			System.out.println("Produto Fabricado em Serrita");
		}else if (codigo == 3) {
			System.out.println("Produto Fabricado em Recife");
		}else if(codigo == 4) {
			System.out.println("Produto Fabricado em Cabrobó");
		}else if((codigo == 5)|| (codigo == 6)) {
			System.out.println("Produto Fabricado em Petrolina");
		}else if((codigo == 7)|| (codigo == 8)|| (codigo == 9)) {
			System.out.println("Produto Fabricado em Santa Maria da Boa Vista");
		}else if (codigo == 10) {
			System.out.println("Produto Fabricado em Oroco");
		}else if (codigo == 11) {
			System.out.println("Produto Fabricado em Lagoa Grande");	
		}else {
			System.out.println("Produto Fabricado na China (Made in China)");
		}
			
	

  }
}
