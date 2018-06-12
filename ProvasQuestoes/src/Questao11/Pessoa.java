package Questao11;

public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public int idade;
	Pessoa proximo = null;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setProximo(Pessoa proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		if(this.idade > outraPessoa.idade ) {
			return 1;			
			}else if (this.idade < outraPessoa.idade){
		return -1;
	
	}
		return idade;
	}
}
