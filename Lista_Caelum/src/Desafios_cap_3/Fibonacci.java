package Desafios_cap_3;

public class Fibonacci {

	public static void main(String[] args) {
        int ultimo=1, 
            penultimo=0;
        
        while( (ultimo + penultimo) <=100){
            System.out.println(ultimo + penultimo);
            
            ultimo = ultimo + penultimo;
            penultimo = ultimo - penultimo;
        }
        
    }

}
