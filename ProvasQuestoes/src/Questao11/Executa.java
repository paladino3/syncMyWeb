package Questao11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executa {

	public static void main(String[] args) {
		
		
	ArrayList<Pessoa> pessoa = new ArrayList<>();	
		Pessoa p1 = new Pessoa("Wesley", 24);
		Pessoa p2 = new Pessoa("Nayara", 24);
		Pessoa p3 = new Pessoa("Claudia", 32);
		Pessoa p4 = new Pessoa("Daniel", 41);
		Pessoa p5 = new Pessoa("Elza", 15);

		System.out.println("##### Lista #####");
		
		
	Lista lista =  new Lista();
		pessoa.add(p1);
		pessoa.add(p2);
		pessoa.add(p3);
		pessoa.add(p4);
		pessoa.add(p5);
	
		Collections.sort(pessoa);
	for(Pessoa p: pessoa) {	
		System.out.println(p);
	}
	
		
		lista.adiciona(new Pessoa("Fabio",8));
		lista.adiciona(new Pessoa("Hirma",42));
		lista.adiciona(new Pessoa("Italo",60));
		
		lista.imprimi();
		
		lista.removeFila();
		lista.removePilha();
		lista.adiciona(new Pessoa("Augusto",17));
		lista.adiciona(new Pessoa("Rafael",22));
		lista.adiciona(new Pessoa("Lorraine",26));
		lista.adiciona(new Pessoa("Alberto",35));
		
		
		lista.imprimi();
	}

}
