package Questao02;

import java.util.Comparator;

public class Funcionario implements Comparable<Funcionario>{
	
	private int id;
	private  int idade;
	private String nome;
	private double salario;
	
	
	
	public Funcionario(int id, int idade, String nome, double salario) {
		super();
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.salario = salario;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}



	@Override
	public int compareTo(Funcionario outroFunc) {
		if(this.getId() > outroFunc.getId()) {
			 return 1;
		}else if (this.getId() < outroFunc.getId() ) {
			return -1;

		}
		return id;
	}		
	
	public static  Comparator<Funcionario> CompararPorIdade = new Comparator<Funcionario>() {

		@Override
		public int compare(Funcionario func1, Funcionario func2) {
			if(func1.getIdade() == func2.getIdade()) {
        		return (int)(func1.getSalario() - func2.getSalario());
        	}else {
        		return func1.getIdade() - func2.getIdade();
			}
        }
    };



	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", idade=" + idade + ", nome=" + nome + ", salario=" + salario + "]";
	}
    
    
    
}
		
		   			
	
	
	

	

