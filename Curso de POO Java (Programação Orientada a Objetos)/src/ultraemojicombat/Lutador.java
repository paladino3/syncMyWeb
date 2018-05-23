package ultraemojicombat;

public class Lutador {
 // Atributos 
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias,derrotas,empates;

//Metados publicos	
	
	public void apresentar() {
		System.out.println("___________________________________________________");
		System.out.println("Chegou a hora aprensentamos o lutador: "+getNome());
		System.out.println("Diretamente de: "+getNacionalidade());
		System.out.println("Com: "+getIdade() + " anos e " + this.altura+" altura");
		System.out.println("Pesando "+this.getPeso() + " Kg "+ "Categoria: "+ this.getCategoria());
		System.out.println("");
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates()+ " Empates!");
		System.out.println("");
	}

	public void status() {
		System.out.println(this.getNome() +" é um peso: " + "|"+this.getCategoria()+"|");
		System.out.println("Ganhou: "+this.getVitorias() + " Vezes");
		System.out.println("Perdeu: "+this.getDerrotas() + " Vezes");
		System.out.println("Empatou: "+this.getEmpates() + " Vezes");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatar() {
		this.setEmpates(this.getEmpates()+1);
	}
	// metados especiais

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private float getAltura() {
		return altura;
	}

	private void setAltura(float altura) {
		this.altura = altura;
	}

	private float getPeso() {
		return peso;
	}

	private void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		this.categoria = categoria;
		if(this.peso < 52.2) {
			this.categoria="Categoria inválida";
		}else if(this.peso <= 70.3){
			this.categoria="Leve";
		}else if(this.peso <=83.9){
			this.categoria="Médio";
		}else if(this.peso <= 120.2) {
			this.categoria="Pesado";
		}else {
			this.categoria="Categoria inválida";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
