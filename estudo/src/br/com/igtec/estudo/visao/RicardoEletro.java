package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Loja;
import br.com.igtec.estudo.modelo.Movel;

public class RicardoEletro {
	public static void main(String[] args) {
		Movel movel = new Movel();
		movel.nome = "Mesa sucupira";
		movel.material = "Madeira";
		movel.numeracaoMovel = 1;
		
		Loja loja = new Loja();
		loja.nome = "Ricardo Eletro";
		loja.movel = movel;
		
		loja.movel.numeracaoMovel = 24;
		
		System.out.println(movel.material);
		System.out.println(loja.movel.material);
		System.out.println(movel.numeracaoMovel);
	

	}

}
