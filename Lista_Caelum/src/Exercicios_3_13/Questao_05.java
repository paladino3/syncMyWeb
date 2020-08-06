package Exercicios_3_13;

public class Questao_05 {
	
	 public static void main(String[] args) {
	        
	        long n,
	            fatorial=1;
	        
	        for(n=1 ; n<=20 ; n++){
	            fatorial = fatorial * n;
	            System.out.println("O fatorial de "+ n + " é (" +(n-1)+"!) * "+n+" = "+fatorial);            
	        }
	        
	    }
}
