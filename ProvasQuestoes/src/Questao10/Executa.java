package Questao10;

public class Executa {

	public static void main(String[] args) {
		
		Recipiente recipientePadrao = new Recipiente(); //padrao sem parametro
		Recipiente recipiente = new Recipiente(2500.0); // uma com parametro capacidade definida
		
		RecepienteProtegido recipienteProtegido = new RecepienteProtegido();
		
		Substancia subs1 = new Substancia("Alcool", true); // duas subs uma inflamavel outra nao
		Substancia subs2 = new Substancia("Agua", false);
		
		
		
		recipiente.setSubistancia(subs1);
		
		recipiente.getCapacidade();
		
		recipiente.setQuantidade(100.0);
		recipiente.adicionar(100.0);
		
		
		recipiente.remover(2300.0);
		recipiente.adicionar(5000.0);
	
	System.out.println(recipiente.toString());
	}

}
 