package Questao01;

import java.util.ArrayList;

public class ContaBancaria {
	
	
	private int numConta;
	private int digitoVerificador;
	
	
	
	public ContaBancaria(int nConta) {
		this.numConta = nConta;
		this.digitoVerificador = calcularDv(nConta); //método já implementado
		
	}
	
		public int calcularDv(int nConta) { //métodos
			
			String contaString = Integer.toString(numConta); // declarando o numero da conta sem ser primitivo
			
		
			
		    ArrayList<Integer> arrayDigitosConta = new ArrayList<Integer>(); //lista de digitos da conta 
		    arrayDigitosConta.add(numConta);// adicionando o numero da conta na lista
	      
	        int valor = 0; // iniciando com 0
	        
	        for (Integer integer : arrayDigitosConta) { 
	            System.out.println(integer);
	            valor += integer;
	        }
	        
			return valor %11;
		}
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numConta=" + numConta + ", digitoVerificador=" + digitoVerificador + "]";
	}	
}
