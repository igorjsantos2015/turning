package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Pessoa;

public class TesteObjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		Pessoa p5 = new Pessoa();
		
		p1.nome = "Gleidson";
		p2.nome = "Maria Sophia";
		p3.nome = "Marta";
		p4.nome = "Bruna";
		p5.nome = "Igor";
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		System.out.println(p4.nome);
		System.out.println(p5.nome);
		
		
	}
	
}
