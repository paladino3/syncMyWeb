package Aluno03;

public class Aula03 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("BIC_CRYSTAL", "Azul", 0.5f, 15); 
		
		
		c1.status();
		c1.rabiscar();
		
		
		Caneta c2 = new Caneta("Bic2", "Amarela", 0.8f, 100 );
		
		c2.setDestampada(true);
	c2.rabiscar();

c2.status();
		
		
		
		
	}
}
