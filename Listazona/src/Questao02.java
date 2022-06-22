
public class Questao02 {

	public static void main(String[] args) {
		/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
		números 4, 5 e 6. A soma das duas médias. A média das médias.
	    */	
		float ma;
		float ma2, soma, medias;
		
		// Resolvendo a primeira média (8,9 e 7).
		ma = ((8 + 9 + 7 )/3);
		
		//Resolvendo a segunda média (4,5 e 6).
		ma2 = ( (4 + 5 + 6 )/3);
		
		//Realizando a soma das médias.
		soma = ma + ma2;
		
		//Realizando a média das médias.
		medias = ((ma + ma2)/2);		
		
		System.out.println("A media aritmetica de 8,9 e 7 e igual a: " + ma );
		System.out.println("");
		System.out.println("A media aritmetica de 4, 5 e 6 e igual a: " + ma2);
		System.out.println("");
		System.out.println("A soma das duas medias e igual a: " + soma);
		System.out.println("");
		System.out.println("A media das medias e igual a: " + medias);
		
		
		
		
	}

}
