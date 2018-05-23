package Questao02teste;

public class Laptop implements Comparable<Laptop> {

	private String modelo;
	private int ram;
	private int preço;
	
	public Laptop(String modelo, int ram, int preço) {
		super();
		this.modelo = modelo;
		this.ram = ram;
		this.preço = preço;
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
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
@Override
	public int compareTo(Laptop outroLaptop) {
		if(this.preço > outroLaptop.getPreço()) {
			return 1;
		}else if (this.getPreço() < outroLaptop.getPreço()) {
			return -1;
		}
		return 0;
	}

@Override
public String toString() {
	return "Laptop [modelo=" + modelo + ", ram=" + ram + ", preço=" + preço + "]";
}



}
