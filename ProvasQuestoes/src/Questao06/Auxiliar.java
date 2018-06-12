package Questao06;

import javax.management.modelmbean.DescriptorSupport;


public abstract class Auxiliar extends Correntista implements MovimentoConnta, OperacoesBanco {

	

	public Auxiliar(String cpfCliente, float saldo) {
		super(cpfCliente, saldo);
	
	}

	@Override
	public String  getCPFCorrentista(Correntista correntista) {
	
		return correntista.getCpfCliente();
	}
	@Override //sobrescrita do metodo 
	public double getValorMovimento(Correntista correntista,float movimentoConta) {

		double Saldo=correntista.getSaldo()-getValorMovimento();
		correntista.setSaldo(Saldo);
		return correntista.getSaldo();	
		
	}


	@Override
	public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
	
		for (Correntista correntista : todosCorrentistas) {
			if (correntista.getCpfCliente() == cpfProcurado) {
				return correntista;
			}
		}
		return null;
	}

}
