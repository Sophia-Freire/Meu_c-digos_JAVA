import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*2) Crie um algoritmo que solicite ao usuário que informe o seu nome completo e sua idade. Imprima 
	  na tela usando um único sysout uma mensagem informando seu nome e idade. 
	  Ex: 
	  "<nome completo> possui <idade> anos de idade"
	  */
	  Scanner leia = new Scanner(System.in);
	  
	  int idade;
	  
	   System.out.println("Informe seu nome completo");
	   String nomeCompleto; 
	   nomeCompleto = leia.nextLine();

	   System.out.println("Informe sua Idade");
	   idade = leia.nextInt();
	   
	   System.out.println(nomeCompleto + " possui " + idade + " anos");
	}

}
