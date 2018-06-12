package Questao10;

public class Recipiente {

	private double capacidade;
	private double quantidade;
	private Substancia subistancia;
	
	
	
	public Recipiente() {// construtor padrao inicializado
		
		final double capacidade = 5000.0;
		this.quantidade = quantidade;
		}
	
	
	public Recipiente(double capacidade) {
	
	this.capacidade = capacidade;
	this.quantidade = quantidade;
	}
	
	// metodos adicionar / remover
	public void adicionar(double quantidade) {
		
		try {
			if (quantidade <= this.quantidade) {
				this.quantidade = quantidade;
			} else {
				throw new FullExeception();
			}
		} catch (FullExeception elemento) {
			
			System.out.println("\n"+elemento.getMensagem());
		}
		
	}
	public void remover(double quantidade) {
		
		try {
			if (quantidade <= this.quantidade) {
				this.quantidade = this.quantidade - quantidade;
			} else {
				throw new EmptyException();
			}
		} catch (EmptyException elemento) {
			
			System.out.println("\n"+elemento.getMensagem());
		}
	}
	
	
	//getters e setters
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Substancia getSubistancia() {
		return subistancia;
	}
	public void setSubistancia(Substancia subistancia) {
		this.subistancia = subistancia;
	}


	@Override
	public String toString() {
		return "Recipiente [capacidade=" + capacidade + ", quantidade=" + quantidade + ", subistancia=" + subistancia+ "]";
	}
	
}
