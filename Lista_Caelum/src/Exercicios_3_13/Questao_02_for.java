package Exercicios_3_13;

public class Questao_02_for {
	
    public static void main(String[] args) {
        
        int numero,
            soma=0;
        
        for(numero = 1 ; numero <= 1000 ; numero++){
            soma = soma + numero;
        }
        
        System.out.println("Soma: " +soma);

    }
}
