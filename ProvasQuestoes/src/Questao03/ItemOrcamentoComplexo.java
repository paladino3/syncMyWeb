package Questao03;

public class ItemOrcamentoComplexo implements AnimalOrcamento{

	private String nomeAnimal;
	private Double orcamento;
	private boolean vacinaW;
	
	public void orcamentoGastosAnimal (Object[] vetor, int tamanhoVetor) {
		
		for(int i=0; i<tamanhoVetor; i++) {
			
		}
	}
	

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public boolean isVacinaW() {
		return vacinaW;
	}

	public void setVacinaW(boolean vacinaW) {
		this.vacinaW = vacinaW;
	}


	@Override
	public ItemOrcamentoComplexo orcamentoGastosAnimal() {
		// TODO Auto-generated method stub
		return null;
	}
}
