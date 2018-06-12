package Questao07;

import java.util.ArrayList;

public class Controle {
	
	private String tipoCaminhao;
	private int numPluviometro;
	private ArrayList<String> listaPluviometro ; //listaPluviometro[]
	
	
	//getters e setters 
	public String getTipoCaminhao() {
		return tipoCaminhao;
	}
	public void setTipoCaminhao(String tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}
	public int getNumPluviometro() {
		return numPluviometro;
	}
	public void setNumPluviometro(int numPluviometro) {
		this.numPluviometro = numPluviometro;
	}
	public ArrayList<String> getListaPluviometro() {
		return listaPluviometro;
	}
	public void setListaPluviometro(ArrayList<String> listaPluviometro) {
		this.listaPluviometro = listaPluviometro;
	}
	
	
	@Override
	public String toString() {
		return "Controle [tipoCaminhao=" + tipoCaminhao + ", numPluviometro=" + numPluviometro + ", listaPluviometro="
				+ listaPluviometro + "]";
	}
	
	
	
	
}
