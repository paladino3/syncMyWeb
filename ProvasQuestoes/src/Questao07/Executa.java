package Questao07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;

public class Executa {

	public static void main(String[] args) {

		boolean parada1 = false;
		Scanner scan = new Scanner(System.in);	
	ArrayList<Controle> listaCaminhoes = new ArrayList<Controle>();
	boolean parada2 =false;
	while (parada1 == false) {
		while(parada2 == false) {
		System.out.println("Digite o tipo de caminhão: 'Alfa' ou 'Beta'? ");
		String tipoCaminhao=scan.next();

			if(tipoCaminhao.equalsIgnoreCase("Alfa") || tipoCaminhao.equalsIgnoreCase("beta")) {
				
			parada2=true;
		}else {
		System.out.println("Inválido");
			parada2 = false;
		}
			
		
		
		System.out.println("Digite o número de pluviômetros a ser transportados: ");
		int numP=scan.nextInt();
		
		ArrayList<String> listaPluviometrica = new ArrayList<>(); 
		
		System.out.println("Insira um tipo de plubiômetro a ser transportado: ");
		String tipoP=scan.next();
		
		System.out.println("Digite 'SIM' para sair ou 'NAO' para continuar: ");
		String seleciona=scan.next();
		
		if(tipoP == null || tipoP == "") {
			parada1 = true;
		}else {
			listaPluviometrica.add(tipoP);
		}
			if(seleciona.equalsIgnoreCase("FIM")) {
				parada1 = true;
				break;
			}
			
		Controle controle = new Controle();
		
		controle.setTipoCaminhao(tipoCaminhao);
		controle.setNumPluviometro(numP);
		controle.setListaPluviometro(listaPluviometrica);
		listaCaminhoes.add(controle); //add controle instanciado na lista
		
		System.out.println(controle.toString()); 
		System.out.println(ControleDeTransporte.selecionarCaminhao(listaCaminhoes).toString());
	}
	}
	}
	
}
	
		
		
		
		
		

