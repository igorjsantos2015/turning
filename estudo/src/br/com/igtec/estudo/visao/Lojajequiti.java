package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Clientes1;
import br.com.igtec.estudo.modelo.Loja1;
import br.com.igtec.estudo.modelo.Produto;
import br.com.igtec.estudo.modelo.Vendedor1;

public class Lojajequiti {
	public static void main(String[] args) {
		Loja1 loja1 = new Loja1();
		loja1.nome = "Loja Jequiti";
		loja1.bairro = "Bairro Gameleira";
		loja1.rua = "rua da paz";
		loja1.numero = 102;

		System.out.println(loja1.nome);
		System.out.println(loja1.bairro);
		System.out.println(loja1.rua);
		System.out.println(loja1.numero);

		Produto produtos = new Produto();
		produtos.marca = "Jequiti";
		produtos.preco = 50;

		produtos.produto1 = new String();
		produtos.produto2 = new String();
		produtos.produto3 = new String();
		produtos.produto4 = new String();
		produtos.produto5 = new String();
		produtos.produto6 = new String();

		produtos.produto1 = "hidratante pele";
		produtos.produto2 = "sabonete";
		produtos.produto3 = "perfume";
		produtos.produto4 = "maquiagem";
		produtos.produto5 = "shapoo";
		produtos.produto6 = "condicionador";

		System.out.println("produto " + produtos.produto1);
		System.out.println("produto " + produtos.produto2);
		System.out.println("produto " + produtos.produto3);
		System.out.println("produto " + produtos.produto4);
		System.out.println("produto " + produtos.produto5);
		System.out.println("produto " + produtos.produto6);

		Vendedor1 vendedor = new Vendedor1();
		vendedor.vendedor1.nome = "Bruna";
		vendedor.vendedor2.nome = "Amanda";
		vendedor.vendedor3.nome = "Igor";
		vendedor.vendedor4.nome = "Gleidson";
		vendedor.vendedor5.nome = "marta";
		vendedor.vendedor6.nome = "Larissa";

		System.out.println("vendedora " + vendedor.vendedor1.nome);
		System.out.println("vnededora " + vendedor.vendedor2.nome);
		System.out.println("vendedora " + vendedor.vendedor3.nome);
		System.out.println("vendedora " + vendedor.vendedor4.nome);
		System.out.println("vendedora " + vendedor.vendedor5.nome);
		System.out.println("vendedora " + vendedor.vendedor6.nome);

		Clientes1 clientes = new Clientes1();
		clientes.cliente1.nome = "Sophia";
		clientes.cliente2.nome = "Thalita";
		clientes.cliente3.nome = "Vitoria";
		clientes.cliente4.nome = "Karol";
		clientes.cliente5.nome = "Maria";
		clientes.cliente6.nome = "Joicy";

		System.out.println("cliente " + clientes.cliente1.nome);
		System.out.println("cliente " + clientes.cliente2.nome);
		System.out.println("cliente " + clientes.cliente3.nome);
		System.out.println("cliente " + clientes.cliente4.nome);
		System.out.println("cliente " + clientes.cliente5.nome);
		System.out.println("cliente " + clientes.cliente6.nome);
	}

}
