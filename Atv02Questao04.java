import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		/*4) Elabore um algoritmo que solicite ao usuário o seu sexo (M ou F) e armazene em uma
             variável do tipo char. Imprima na tela “Masculino”, caso ele(a) tenha informado
              M, e “Feminino”, caso ele(a) tenha informado F.
		 */
		
		Scanner leia = new Scanner (System.in);
		char sexo;
					
		System.out.println("Informe seu sexo ( M para masculino, F para feminino)");
		 sexo = leia.next().charAt(0); 
		if (sexo == 'M'){
			System.out.println("MASCULINO");	
		}else if (sexo == 'F'){
			System.out.println("FEMININO");
		}
		 
		
	}

}
