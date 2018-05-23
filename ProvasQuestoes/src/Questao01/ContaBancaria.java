package Questao01;

public class ContaBancaria {
	
	
	private int numConta;
	private int digitoVerificador;
	int x,y;
	
	
	public ContaBancaria(int nConta) {
		this.numConta = nConta;
		this.x = numConta;
		this.y = digitoVerificador;
		
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
