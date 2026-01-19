package ed;


public class Vector {
	
	private Aluno[] alunos = new Aluno[100];
	
	
	public void adiciona(Aluno aluno) {
	
		for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		
	}
	
	public Aluno pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		return false;
	}
	
	public int tamanho() {
		return 0;
	}
	
}

