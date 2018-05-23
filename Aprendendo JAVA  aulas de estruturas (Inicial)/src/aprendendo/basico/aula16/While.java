package aprendendo.basico.aula16;

public class While {

	public static void main(String[] args) {
	
		int i = 1; // count 
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max ) {
			System.out.println("Valor de i: " + i);
			i++; 
		}
		
		
		System.out.println(i); // valor de 11
					
	

	do {
		i++;
		System.out.println("valor de i: " + i);
	}while (i < 8 ); 
		System.out.println(i);
	}
}

