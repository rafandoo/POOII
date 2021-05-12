package atv02;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Letícia");
		a1.setMatricula("2020006749");
		a1.setCpf("111.111.111-11");
		a1.setDataNascimento("12/02/2001");
		a1.setEmail("lehh.kowalski@gmail.com");
		
		Aluno a2 = new Aluno();
		
		a2.setCpf("Marcelo");
		a2.setMatricula("2020006040");
		a2.setCpf("222.222.222-22");
		a2.setDataNascimento("23/11/2000");
		a2.setEmail("marcelo@gmail.com");
		
		Persistenciajson pj = new Persistenciajson();
		pj.adiciona(a1);
		pj.adiciona(a2);
		pj.resultado();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("\n\n");
		System.out.println(pj.resultado());
		System.out.println("\n");
		System.out.println(pj.leitura());
	
		
	}

}
