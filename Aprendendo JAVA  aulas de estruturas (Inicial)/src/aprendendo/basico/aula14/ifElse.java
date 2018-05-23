package aprendendo.basico.aula14;

import java.util.Scanner;

public class ifElse {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		
	/*System.out.println("Entre com sua idade: ");	
	int idade = scan.nextInt();	
	
	if (idade >=18) {
		System.out.println("Você é maior de idade.");
	}
	else{
	System.out.println("Você é menor de idade.");
	}
	
	// barato <= 10
	// entre 10 < valor < 15 - pedir desconto
	// entre 15 <= 17 - pesquisar mais
	// >= 17 - muito caro
	 * 
	 */
	System.out.println("Entre com o preço do item: ");
	double valor = scan.nextDouble();
	
	if (valor <=10) {
		System.out.println("Compre imediatamente, está barato. ");
	} else if (valor > 10 && valor < 15) {
		System.out.println("Você pode pedir desconto ");
	} else if (valor >= 15 && valor < 17 ) {
		System.out.println("Deve pesquisar mais ");
	} else { // valor >= 17
		System.out.println("muito caro! ");
	}
	}

}
