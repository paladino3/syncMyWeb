package Questao02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executa {

	public static void main(String[] args) {
		
		
		List <Funcionario> funcionarios = new ArrayList();
		Funcionario func0 = new Funcionario(0, 28, "Wesley", 1900.0);
		Funcionario func1 = new Funcionario(2, 25, "Wagner", 2150.0);
		Funcionario func2 = new Funcionario(1, 26, "Lorraine", 1980.0);
		Funcionario func3 = new Funcionario(3, 26, "Shibashi", 1830.0);
		funcionarios.add(func0);
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);	
	
System.out.println("### Lista sem Ordenamento ###");
	for (Funcionario func : funcionarios) {
		System.out.println(func);
	}
	
System.out.println(" ");	

System.out.println("### Ordenado pelo iD e Nome ###");
Collections.sort(funcionarios);

for (Funcionario func : funcionarios) {
	System.out.println("Funcionario  [id="+func.getId()+","+" nome="+ func.getNome()+"]");
}

System.out.println("");

System.out.println("### Ordenado pela Idade e salário ###");
Collections.sort(funcionarios, Funcionario.CompararPorIdade);

for (Funcionario func : funcionarios) {
	System.out.println("Funcionario  [nome="+func.getNome()+","+" idade="+ func.getIdade()+","+" salario="+func.getSalario()+"]");
	
	}
}
}