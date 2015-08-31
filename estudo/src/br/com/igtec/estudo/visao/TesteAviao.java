package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Aviao;
import br.com.igtec.estudo.modelo.Pessoa;

public class TesteAviao {
	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.piloto = new Pessoa();
		aviao.piloto.nome = "igor";
		aviao.piloto.idade = 22;
		aviao.piloto.peso = 50;
		
		aviao.aeromoca = new Pessoa();
	
		aviao.aeromoca.nome = "amanda";
		
		aviao.passageiro = new Pessoa();
		aviao.passageiro.nome = "gleidson";
		
		aviao.destino = "paris";
		
		
		System.out.println("Nome do piloto: " + aviao.piloto.nome);
		System.out.println("Nome da aeromoca: " + aviao.aeromoca.nome);
		System.out.println("Nome do passageiro: " + aviao.passageiro.nome);
		System.out.println("Destino a: " + aviao.destino);
		
		
	}

}
