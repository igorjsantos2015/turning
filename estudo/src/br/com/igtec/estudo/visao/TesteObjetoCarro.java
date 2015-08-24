package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Carro;
import br.com.igtec.estudo.modelo.Motor;
import br.com.igtec.estudo.modelo.Pessoa;

public class TesteObjetoCarro {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.proprietario = new Pessoa();
		c.motor = new Motor();
		
		
		
		c.proprietario.nome = "Gleidson";
		c.nome = "Crossfox";
		c.cor = "Amarelo";
		c.motor.potencia = 1.6f;
		
		c.passageiroUm = new Pessoa();
		c.passageiroUm.nome = "igor";
		System.out.println(c.passageiroUm.nome);
		System.out.println(c.proprietario.nome);
		
		c.passageiroDois = new Pessoa();
		
		c.passageiroDois.nome = "bruna";
		
		System.out.println(c.passageiroDois.nome);

		System.out.println(c.motor.potencia);
	}
	
}
