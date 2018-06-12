package Questao10;

public class EmptyException extends RuntimeException {

	private String mensagem;

	public EmptyException() {
		this.mensagem = "EmptyException";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
