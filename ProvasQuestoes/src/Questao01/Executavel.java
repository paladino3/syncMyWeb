package Questao01;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o numero da conta");
		int nConta=sc.nextInt();
		
		ContaBancaria cb= new ContaBancaria(nConta);
		System.out.println(cb);
				
	}

}
