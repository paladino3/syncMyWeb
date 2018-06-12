package Questao07;

import java.util.ArrayList;

public class ControleDeTransporte extends Controle {

	static Controle selecionarCaminhao(ArrayList<Controle>listaCaminhoes) {
		
		Controle controleCaminhao = new Controle();
		
		controleCaminhao.setTipoCaminhao("");
		controleCaminhao.setNumPluviometro(0);
		controleCaminhao.setListaPluviometro(new ArrayList<>());
		
		for (int i = 0; i < listaCaminhoes.size(); i++) {
			if (controleCaminhao.getListaPluviometro().size() < listaCaminhoes.get(i).getListaPluviometro().size()) {
				controleCaminhao = listaCaminhoes.get(i);
			}
	
		}
		return controleCaminhao;
}
}