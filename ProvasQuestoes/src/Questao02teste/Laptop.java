package Questao02teste;

public class Laptop implements Comparable<Laptop> {

	private String modelo;
	private int ram;
	private int pre�o;
	
	public Laptop(String modelo, int ram, int pre�o) {
		super();
		this.modelo = modelo;
		this.ram = ram;
		this.pre�o = pre�o;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPre�o() {
		return pre�o;
	}
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}
@Override
	public int compareTo(Laptop outroLaptop) {
		if(this.pre�o > outroLaptop.getPre�o()) {
			return 1;
		}else if (this.getPre�o() < outroLaptop.getPre�o()) {
			return -1;
		}
		return 0;
	}

@Override
public String toString() {
	return "Laptop [modelo=" + modelo + ", ram=" + ram + ", pre�o=" + pre�o + "]";
}



}
