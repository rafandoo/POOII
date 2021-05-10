package atv02;

import java.security.NoSuchAlgorithmException;

public class Pessoa {
	
	private String nome;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) throws NoSuchAlgorithmException {
		setNome(nome);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
