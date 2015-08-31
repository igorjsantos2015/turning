package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Funcionario;

public class Start {
	public static void main(String[] args) {
		
		
		Funcionario f = new Funcionario();
		f.cpf = "11948476681";
		f.nome = "josy";
		f.idade = 21;
		f.matricula = "345";
		
		System.out.println(f.nome);
		System.out.println(f.idade);
		System.out.println(f.matricula);
		System.out.println(f.cpf);
		
		
		
	}

}
