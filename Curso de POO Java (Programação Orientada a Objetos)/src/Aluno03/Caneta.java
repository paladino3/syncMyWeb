package Aluno03;

public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada=true;
	private boolean destampada=false;
	public Caneta(String modelo, String cor, float ponta, int carga) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;		
		this.carga = carga;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isDestampada() {
		return destampada;
	}

	public void setDestampada(boolean destampada) {
		this.destampada = destampada;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	void status() {
		System.out.println("Está caneta tem modelo: "+modelo
		+" Cor: "+getCor()+" Carga atual: "+getCarga()+"%"+ " Ponta: "+getPonta());
	}	
	 void rabiscar() {	
		 if(destampada == true) {
			 System.out.println("Estou rabiscando :D");
		 }else {
			 System.out.println("ERRO, não consigo rabiscar");
		 }
	}
}	

		
	
	

