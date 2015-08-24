package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Pessoa;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa pessoa = new Pessoa();
		
		
		p1.nome = "Bruna Poucotom";
		p1.idade = 17;
		p1.peso = 58;
		
		p1.gritar();
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p1.peso);

		pessoa = p1;
		
		System.out.println(pessoa.nome);
		
		pessoa = new Pessoa();
		
		pessoa.nome = "Debora";
		
		
		System.out.println(p1.nome);
		System.out.println(pessoa.nome);
		
		p1.gritar();
		
	}
	

}
