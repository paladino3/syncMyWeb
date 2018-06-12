package Questao10;

public class RecepienteProtegido extends Recipiente {

	private boolean protegido;
	
	
	public void RecepienteProtegido() {
		
	}
	

	
	@Override
	public void adicionar(double quantidade) {
		try {
			if (this.protegido == true) {
				throw new SecurityException();
			}else {
				super.adicionar(quantidade);
			}
		} catch (SecurityException e) {
			System.err.println(e.getMensagem());
		}
	}


	
	
	@Override
	public void remover(double quantidade) {
		try {
			if (this.protegido == true) {
				throw new SecurityException();
			}else {
				super.remover(quantidade);
			}
		} catch (SecurityException e) {
			System.err.println(e.getMensagem());
		}
	}
	
	

	
	public boolean isProtegido() {
		return protegido;
	}

	public void setProtegido(boolean protegido) {
		this.protegido = protegido;
	}

}
