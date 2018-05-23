package aprendendo.basico.aula13;

public class OperadoresRelacionaisLogicos {

	public static void main(String[] args) {
		
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado = (valor1==1) && (valor2==2);
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: " + resultado);
		
		
		boolean resultado2 = (valor1==1) || (valor2==2);
		System.out.println("Valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);
		
		
	}

}
