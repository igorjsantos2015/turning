package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Boate1;
import br.com.igtec.estudo.modelo.Boate2;
import br.com.igtec.estudo.modelo.Participar;
import br.com.igtec.estudo.modelo.Pessoa;

public class BoateIJ {
	
	public static void main(String[] args) {
		
		Boate1 boate = new Boate1();
		boate.nome = "Boate IJ";
		boate.material = "cobertura de Isopor";
		boate.maximoPessoa = 2000;
		
		boate.funcionarios1 = new Pessoa();
		boate.funcionarios2 = new Pessoa();
		boate.funcionarios3 = new Pessoa();
		boate.funcionarios4 = new Pessoa();
		boate.funcionarios5 = new Pessoa();
		boate.funcionarios6 = new Pessoa();
		
		boate.funcionarios1.nome = "Amanda";
		boate.funcionarios2.nome = "Jessica";
		boate.funcionarios3.nome = "vitoria";
		boate.funcionarios4.nome = "karine";
		boate.funcionarios5.nome = "junior";
		boate.funcionarios6.nome = "igor";
					
		System.out.println(boate.funcionarios1.nome);
		System.out.println(boate.funcionarios2.nome);
		System.out.println(boate.funcionarios4.nome);
		System.out.println(boate.funcionarios5.nome);
		System.out.println(boate.funcionarios6.nome);
		
		Boate2 boate2 = new Boate2();
		boate2.evento = "festival de cores";
		
		boate2.dj = new Pessoa();
		boate2.dj.nome = "dj Daniel";
		boate2.ingresso = 40;
		boate2.igressopen = 80;
		boate2.comecaEvento = 8;
		boate2.terminaEvento = 3;
		boate2.bairro = "bairro gameleira";
		boate2.rua = "rua da paz";
		boate2.numero = 319;
		
		System.out.println(boate2.evento);
		System.out.println(boate2.dj.nome);
		System.out.println(boate2.ingresso+" reais o ingresso");
		System.out.println(boate2.igressopen+" reais o open");
		System.out.println(boate2.comecaEvento+" horas o envento começa");		
		System.out.println(boate2.terminaEvento+" termina o evento");		
		System.out.println(boate2.bairro);
		System.out.println(boate2.rua);
		System.out.println(boate2.numero+" o local");
		
		Participar participar = new Participar();
		participar.pessoa1.nome = "Karol";
		participar.pessoa2.nome = "Gleidson";
		participar.pessoa3.nome = "Bruna";
		participar.pessoa4.nome = "Marta";
		participar.pessoa5.nome = "Larissa";
		participar.pessoa6.nome = "Rafael";
		
		System.out.println(participar.pessoa1.nome);
		System.out.println(participar.pessoa2.nome);
		System.out.println(participar.pessoa3.nome);
		System.out.println(participar.pessoa4.nome);
		System.out.println(participar.pessoa5.nome);
		System.out.println(participar.pessoa6.nome);
				
		
	}

}
