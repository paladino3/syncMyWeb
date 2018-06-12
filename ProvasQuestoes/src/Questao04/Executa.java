package Questao04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;

public class Executa {

	public static void main(String[] args) {
		
		Random gerarNumeros = new Random();
		//Gera os numero de forma randomica
		
		Map<Integer,Integer> numeros = new HashMap<Integer,Integer>();
		//
		
		Map<Integer,ArrayList<Integer>> res = new HashMap<Integer, ArrayList<Integer>>();
		//
		
		
		// Para gerar numero no Map
		for(int i = 0; i <= 1000 ; i++) {
		numeros.put(i, gerarNumeros.nextInt(101));
		//chave(Key) (i), valor = gerarNumeros.inteiros (0 a 100));
	}
		
		Set<Map.Entry<Integer,Integer>> setNumerosGerados = numeros.entrySet();

		for (int i=0; i <=100; i++ ) {//verifica os numeros contido no Map. 
			
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		//lista de array que armazena os numeros repetidos, 
		
		for (Entry<Integer, Integer> tamanho : setNumerosGerados) {//for melhorado
			if( i == tamanho.getValue()){// se o número analizado existir na posicao do map
				listaDeNumeros.add(tamanho.getKey());//sera adicionado
				res.put(i, listaDeNumeros);
			
				//add o numero analizado com a key(chave) na arraylist
			}
		}
	}

		Set<Map.Entry<Integer, ArrayList<Integer>>>setResultado = res.entrySet();
		
		for(Entry<Integer, ArrayList<Integer>> tamanho: setResultado) {
			
			System.out.println("Número: "+tamanho.getKey()+" Posição do número: "+tamanho.getValue());
		}
	}
}
