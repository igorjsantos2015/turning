package br.com.igtec.estudo.modelo;

public class Carro {
	
	public String nome;
	public String cor;
	public int velocidadeAtual;
	public int velocidadeMaxima;
	public Pessoa proprietario;
	public Motor motor;
	public Pessoa passageiroUm;
	public Pessoa passageiroDois;
	public Pessoa passageiroTres;
	public Pessoa passageiroQuatro;
	
	public void acelerar() {
		velocidadeAtual++;
	}
	
	public void frear() {
		velocidadeAtual--;
	}
	
	

}
