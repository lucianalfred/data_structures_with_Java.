package application;

import ed.Aluno;
import ed.Vector;

public class TestaTamanho {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vector lista = new Vector();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.tamanho());
		lista.adiciona(a3);
		System.out.println(lista.tamanho());
	}
}
