package Exercicios_7_7;

public class Conta {
	
protected double saldo;
	
	public void deposita(double valor) {
	    this.saldo += valor;
	}
	
	public void saca(double valor) {
	    this.saldo -= valor;
	}
	
	public double getSaldo() {
	    return this.saldo;
	}
	
	void atualiza(double taxa) {
	    this.saldo += this.saldo * taxa;
	}


}