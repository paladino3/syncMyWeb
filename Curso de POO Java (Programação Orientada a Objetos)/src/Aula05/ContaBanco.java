package Aula05;

import java.util.Scanner;

public class ContaBanco {
Scanner scan= new Scanner (System.in);	
	//Atributos

	public int numeroConta;
	protected String tipoConta;
	private String nomeCliente;
	private double saldo;
	private boolean status;
	


	
public ContaBanco( int numeroConta, String tipoConta, String nomeCliente, double saldo,
			boolean status) {
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo=0;
		this.status = status=false;
	}
// Getters e Setters	
	
	public int getNumeroAgencia() {
		return numeroConta;
	}
	public int setNumeroAgencia() {
		return this.numeroConta = getNumeroAgencia();
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String setNomeCliente(String string) {
		return this.nomeCliente = getNomeCliente();
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public boolean setStatus(boolean status) {
		return this.status = status;
	}
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String i) {
		this.tipoConta = i;
	}
	
	// metodos  a parte mais importante da lógica 	

	public void status() {
		System.out.println("Número da conta: "+getNumeroAgencia());
		System.out.println("");
		System.out.println("Nome cliente: "+getNomeCliente());
		System.out.println("");
		System.out.println("Tipo da conta: "+getTipoConta());
		System.out.println("");
		System.out.print("Saldo: "+getSaldo());
		System.out.println("");
		System.out.println("");
	}
	
	public void abrirConta(int tipoConta){
		System.out.println("Deseja abrir uma conta Corrente(CC) ou uma conta poupança(CP)? ");
			System.out.println("Opção 1: Corrente(CC), +R$ 50,00 crédito ");
			System.out.println("Opção 2: Poupança(CP), +R$ 150,00 crédito ");				
	int resposta=scan.nextInt();		
			
		if(resposta==1) {
			setTipoConta("Conta corrente");
			//saldo+=50; // estou colocando 50 pilas
			setSaldo(50);//estou colocando 50 pilas
			System.out.println("Conta corrente aberta, Créditado R$50,00 no saldo");
		}else {
			if (resposta==2) {
			setTipoConta("Conta poupança");	
			//saldo+=150;
			setSaldo(150);
			System.out.println("Conta poupança aberta, Créditado R$150,00 no saldo");
			}else {
			if(tipoConta !=1 || tipoConta !=2) {
				
			System.out.println("Opção invalida");
		}
			}						
		}
	}

	public void fecharConta(){		
		if(saldo == 0) {
			System.out.println("A conta foi fechada.");
		setStatus(false);	
		}else{
			if(saldo > 0) {
			System.out.println("Não posso fechar a conta no momento por haver saldo, devo retirar.");
			setStatus(true);
		}else {
			if (saldo < 0) {
				System.out.println("Não posso fechar a conta no momento por estar em débito");	
				setStatus(true);
			}
		}
	}
		
		
}	
	public void depositar(double valor){ // adiconar dinheiro ao saldo
		if(status = true) {
			saldo+=valor;
		System.out.println("Foi depositado a quantia de R$: "+valor);	
		
		}
		
}
	public void sacar(double valor){ // retirar dinheiro ao saldo
		if(setStatus(true))
		if (saldo >= valor) {
			saldo-=valor;
		}else {
			System.out.println("Não foi possível sacar, saldo insuficiente");
		}
}
	public void pagarMensalidade() { // cada vez chamado retirar R$12,00 do saldo
		if(this.setStatus(true)){
			saldo -=12.0;
			System.out.println("Pago R$12,00 de taxa de manutenção");
			getSaldo();
		}else {	
	
			System.out.println("A conta foi fechada.");
		}
	}	

}
