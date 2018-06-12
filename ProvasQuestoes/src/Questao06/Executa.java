package Questao06;

import java.util.ArrayList;

public class Executa   {

	public static void main(String[] args) {

		ArrayList<Correntista> Correntistas = new ArrayList<Correntista>();
		Correntista c0 = new Correntista("01229688919", 100);
		Correntista c1 = new Correntista("00000000000", 150);
		Correntista c2 = new Correntista("11111111111", 80);
		Correntista c3 = new Correntista("22222222222", 0);
		Correntista c4 = new Correntista("33333333333", 300);
		Correntistas.add(c0);
		Correntistas.add(c1);
		Correntistas.add(c2);
		Correntistas.add(c3);
		Correntistas.add(c4);
		
	
		for(int i=0; i<Correntistas.size(); i++) {
			System.out.println(Correntistas.get(i).toString());
		}

		
	System.out.println("");
		c1.getSaldo();
		c1.depositar(350);
		System.out.println(c1);
		
		c1.sacar(200);
		
		c1.getSaldo();
		c1.getValorMovimento(c1, 20);
	
	
		System.out.println(c1);
		
}
	
}

