package atv02;

import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String cpf;
	private String email;
	
	SimpleDateFormat dataC = new SimpleDateFormat("dd/MM/yyyy");
	Calendar dataN = new GregorianCalendar();
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String matricula, String cpf, String email) throws NoSuchAlgorithmException {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setEmail(email);
	}
	
	public Aluno(String nome) throws NoSuchAlgorithmException {
		super(nome);
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() > 0)
			this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}


	public void dataNasci(int ano, int mes, int dia) {
		dataN.set(ano, (mes - 1), dia);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", email=");
		builder.append(email);
		builder.append("\n- Data de Nascimento: ");
		builder.append(dataC.format(dataN.getTime()));
		builder.append("]");
		return builder.toString();
	}
	
}
