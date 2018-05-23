package Aula06Controle;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		this.volume = volume=50;
		this.ligado = ligado=false;
		this.tocando = tocando=false;
	}
	// metados 
	
	public void ligar() {
		this.setLigado(true);
		System.out.println("Ligado");
	}
	public void desligar() {
		this.setLigado(false);
		System.out.println("Desligado");
	}
	public void abrirMenu() {
	System.out.println("Está ligado? "+this.getLigado());
	System.out.println("Está tocando? "+this.getTocando());
	System.out.println("Volume: "+this.getVolume());
	 for (int  i=0 ; i <this.getVolume() ; i+=10) {
		 System.out.print("[X]");
	 }
	}
	public void fecharMenu() {
		System.out.println("fechando menu...");
	}
	public void maisVolume() {
		if(getLigado()) {
			this.setVolume(getVolume()+1);
		}
	}
	public void menosVolume() {
		if(getLigado()) {
			this.setVolume(getVolume()-1);
	}
	}
	public void ligarMudo() {
		if(getLigado() && getVolume() > 0) {
		this.setVolume(0);
		}
	}
	public void desligarMudo() {
		if(getLigado() && getVolume() == 0) {
			this.setVolume(10);
		}
	}
	public void play() {
		if(getLigado() && getTocando() == false) { 
			this.setTocando(true);
			System.out.println("Esta tocando Song");
			
		}
	}
	public void pause() {
		if(getLigado() && getTocando() == true) { 
			this.setTocando(false);
	}
	}
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	public void status() {
		System.out.println("Contre: " +getLigado());
		System.out.println("Contre: " +getTocando());
		System.out.println("Contre: " +getVolume());
	}
	
}
