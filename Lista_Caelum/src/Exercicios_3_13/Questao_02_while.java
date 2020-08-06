package Exercicios_3_13;

public class Questao_02_while {	
	
public static void main(String[] args) {
        
        int numero=1,
            soma=0;
        
        while(numero<=1000){
            soma = soma + numero;
            numero++;
        }
        
        System.out.println("Soma: "+soma);

    }

}
