package Questao06;

public class Correntista  {
	
	private String cpfCliente;
	private double saldo;
	
	public Correntista(String cpfCliente, float saldo) {
		this.cpfCliente = cpfCliente;
		this.saldo = saldo;
	}
	
	 public void depositar(double valor){
		
		  	if(valor >= 0){ 
		  		saldo+=valor;
		  		System.out.println("Deposito efetuado valor R$ "+valor +"  CpfCliente : "+getCpfCliente());
		  
		  	}else{
		  	
		  		System.out.println("\nValor invalido\n\n");
		  	}
		  }
	 
		  public void sacar(double valor){
		  	if(valor < getSaldo() && valor > 0){ 
		  		saldo-=valor;
		  		System.out.println("Saque efetuado no valor R$ "+valor +" Novo saldo R$ "+getSaldo()+"\nCliente CPF: "+getCpfCliente());
		  	
		  	}else{
		  		if(valor < 0){
		  			System.out.println("\nValor invalido\n\n"); 
		  		}else{
		  			System.out.println("\nSaldo Insuficiente\n\n"); 
		  		}
		  	}
		  }
		  


		  
	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo2) {
		this.saldo = saldo2;
	}

	
	@Override
	public String toString() {
		return "Correntista [cpfCliente=" + cpfCliente + ", saldo=" + saldo + "]";
	}

	public double getValorMovimento(Correntista correntista, float movimentoConta) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCPFCorrentista(Correntista correntista) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
