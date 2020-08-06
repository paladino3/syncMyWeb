package Desafios_cap_5;

import java.util.Scanner;

public class Questao_01 {
	
	public static void main(String[] args) {
	        
	        int[] serieFibonacci = new int[100];
	        
	        serieFibonacci[0]=0;
	        serieFibonacci[1]=1;
	        int n;
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Que elemento da série deseja calcular (0-99): ");
	        n = entrada.nextInt();
	        
	        for(int elemento=2 ; elemento<=n ; elemento++){
	            serieFibonacci[elemento] = serieFibonacci[elemento-1] + serieFibonacci[elemento-2];
	        }
	        
	        System.out.println("O valor do elemento " + n + " é: " + serieFibonacci[n]);
	    }

	}
