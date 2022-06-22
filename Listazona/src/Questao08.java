import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		/*A empresa XYZ decidiu conceder um aumento de salários a seus funcionários de acordo
com a tabela abaixo:

		0    - 400    =   15%
		401  - 700    =   12%
		701  - 1000   =   10%
		1001 - 1800   =   7%
		1801 - 2500   =   4%
		acima de 2500 =   sem aumento
			
			
 	Escrever um algoritmo que lê, para cada funcionário, o seu nome e o seu salário atual.
	Após receber estes dados, o algoritmo calcula o novo salário e escreve na tela as seguintes
	informações: <nome do funcionário> <% de aumento> <salário atual> <novo salário>

*/

		Scanner leia = new Scanner (System.in);
		
		String nome;
		double sal, sal2, resu;
		
		System.out.print("Nome: ");
		nome = leia.next();
		System.out.print("Salario atual: ");
		sal = leia.nextDouble();
		
		if ((sal > 0)&& (sal <= 400)) {
			sal2 = (sal * 15/100);
			resu = (sal + sal2);
			System.out.println(nome + " recebeu %15 de aumento. Salario antigo " + sal + ", salario atual " + resu);
				
		}else if ((sal >= 401)&& (sal <= 700)){
			sal2 = (sal * 12/100);
			resu = (sal + sal2);
			System.out.println(nome + " recebeu %12 de aumento. Salario antigo " + sal + ", salario atual " + resu);
			
		}else if ((sal >=701) && (sal <= 1000)){
			sal2 = (sal * 10/100);
			resu = (sal + sal2);
			System.out.println(nome + " recebeu %10 de aumento. Salario antigo " + sal + ", salario atual " + resu);
			
		}else if ((sal >= 1001) && (sal <= 1800)){
			sal2 = (sal * 7/100);
			resu = (sal + sal2);
			System.out.println(nome + " recebeu %7 de aumento. Salario antigo " + sal + ", salario atual " + resu);
			
		}else if ((sal >= 1801) && (sal <= 2500)) {
			sal2 = (sal * 4/100);
			resu = (sal + sal2);
			System.out.println(nome + " recebeu %4 de aumento. Salario antigo " + sal + ", salario atual " + resu);
		}else {
			resu = sal;
			System.out.println(nome + " recebeu %0 de aumento. Salario antigo " + sal + ", salario atual " + resu);}
		
		
	}

}
