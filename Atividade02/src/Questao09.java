import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		/*10) Crie um algoritmo para calcular quanto será pago pela compra de um produto. O valor
			  varia de acordo com a forma de pagamento. Solicite ao usuário o valor do
			  produto e o código da forma de pagamento. Imprima na tela o valor total a ser pago.
 			  Código Condição de pagamento:
 			  
				 1 À vista em dinheiro ou cheque, recebe 10% de desconto
				 2 À vista no cartão de crédito, recebe 15% de desconto
				 3 Em duas vezes, preço normal de etiqueta sem juros
				 4 Em duas vezes, preço normal de etiqueta mais juros de 10%
		 */

		
				Scanner leia = new Scanner (System.in);
				
				double valor, desconto, valorFinal;
				double desconto2, valorFinal2;
				double juros, jurosFinal;
				int cod;
				
				System.out.println("Qual o valor do produto?");
				valor = leia.nextInt();
				
				System.out.println("Qual o codigo  de pagamento do produto?");
				cod = leia.nextInt();
			
				// calculando descontos e juros
				desconto = valor * 10/100;
				valorFinal = valor - desconto;
				
				
				desconto2 = valor * 15/100;
				valorFinal2 = valor - desconto2;
				
				juros =  valor * 10/100;
				jurosFinal = valor + juros ;
				
				
				if (cod == 1) {
					System.out.printf("O valor do produto sera: R$" + "%.2f%n", valorFinal);
				}else if (cod == 2 ){
					System.out.printf("O valor do produto sera: R$" + "%.2f%n", valorFinal2);	
				}else if (cod == 3) {
					System.out.printf("O valor do produto sera: R$" + "%.2f%n", valor);
				}else if (cod == 4) {
					System.out.printf("O valor do produto sera: R$" + "%.2f%n", jurosFinal);
				}else {
					System.out.println("Codigo nao encontrado");
				}
		
		
		
		
	}

}
