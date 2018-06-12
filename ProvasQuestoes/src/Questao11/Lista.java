package Questao11;

import java.util.ArrayList;

public class Lista {

	
	public Pessoa p1 = null;

	public Lista() {
	}

	public void adiciona(Pessoa pessoa) {
		//System.out.println("Adicionou uma pessoa!");
		if (this.p1 == null) {
			this.p1 = pessoa;
		}else {
			recAdiciona(p1, pessoa);
		}

	}

	private void recAdiciona(Pessoa pC, Pessoa pessoa) {
		
		if (pC.proximo == null) {
			pC.proximo = pessoa;
		}else {
			recAdiciona(pC.proximo, pessoa);
		}
	}

	public void imprimi() {
		System.out.println("###### Elementos da Lista");
		recImprime(p1);	
	}

	private void recImprime(Pessoa pessoa) {
		if (pessoa.proximo == null) {
			System.out.println(pessoa);
		}else {
			System.out.println(pessoa);
			recImprime(pessoa.proximo);
		}
		
	}

	public void removeFila() {
		if (p1 != null) {
			Pessoa pNext = p1.proximo;
			p1 = null;
			p1 = pNext;
			this.removeFila();
		} else {
			System.out.println("A lista está vazia");
		}
	}

	public void removePilha() {
		ArrayList<Pessoa>listaPessoa= new ArrayList<Pessoa>();
		boolean parada = false;
		int index=0;
		
		while(parada == false) {
		if (p1 != null)	{
		listaPessoa.add(p1);
		p1 = p1.proximo;
		index++;
	}else {
		parada = true;
	}
}
		for(int i=0 ; i<listaPessoa.size() ; i++) {
			index--;
			this.p1 = listaPessoa.get(i);
			this.p1 = null;
		}
}
}