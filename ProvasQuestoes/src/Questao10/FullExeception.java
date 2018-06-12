package Questao10;

public class FullExeception extends RuntimeException {


	private String mensagem;


	public FullExeception() {
		this.mensagem = "FullException";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
