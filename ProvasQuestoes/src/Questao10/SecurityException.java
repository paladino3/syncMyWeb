package Questao10;

public class SecurityException extends RuntimeException {

	private String mensagem;

	public SecurityException() {
		this.mensagem = "SecurityException";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
}
