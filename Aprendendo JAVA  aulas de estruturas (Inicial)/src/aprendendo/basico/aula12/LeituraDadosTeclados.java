package aprendendo.basico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclados {

	private static Scanner scan;

	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
/*
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto =scan.nextLine();
		System.out.println(""+nomeCompleto);
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("sua idade é: "+ idade);
		
		System.out.println("Digite sua altura: ");
		
		double digiteAltura = scan.nextDouble();
		System.out.println("Sua altura é: " + digiteAltura);
		*/
		System.out.println("Digite o seu primeiro nome, seu altura,quantidade de filhos e se tem bichinho de estimaçao: ");
		String nome = scan.next();
		double altura = scan.nextDouble();
		int filho = scan.nextInt();
		boolean pet =scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Nome: "+ nome); 
		System.out.println("Altura: "+ altura); 
		System.out.println("Filhos?: "+ filho); 
		System.out.println("Pets?: "+ pet); 
		
		
		
		}
	
	

}
