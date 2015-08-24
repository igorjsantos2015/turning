package br.com.igtec.estudo.visao;

import br.com.igtec.estudo.modelo.Aula;
import br.com.igtec.estudo.modelo.Pessoa;

public class Teste { 
	public static void main(String[] args) {
		Aula aula = new Aula();
		aula.materia = "portugues";
		
		aula.aluno1 = new Pessoa();
		aula.aluno1.nome = "igor";
		
		aula.aluno2 = new Pessoa();
		aula.aluno2.nome = "paulo";
		
		aula.aluno3 = new Pessoa();
		aula.aluno3.nome = "vitoria";
		
		aula.aluno4 = new Pessoa();
		aula.aluno4.nome = "gaby";
		
		aula.aluno5 = new Pessoa();
		aula.aluno5.nome = "amanda";
		
		System.out.println(aula.aluno1.nome);
		System.out.println(aula.aluno2.nome);
		System.out.println(aula.aluno3.nome);
		System.out.println(aula.aluno4.nome);
		System.out.println(aula.aluno5.nome);
		
		
	
	}

}
