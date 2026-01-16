package application;

import ed.Aluno;
import ed.Vector;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
	
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a2.setNome("Paulo");
		a1.setNome("Rafeal");
		
		Vector lista = new Vector();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		lista.adiciona(2, a3);
		lista.adiciona(3, a4);
		
		System.out.println(lista);
		
		lista.remove(0);
		
		System.out.print(lista);
		
	}
	
}

