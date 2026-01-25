package ed;


public class Vector {
	
	private Object[] objetos = new Object[100];
	private  int totalDeObjetos = 0; 
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		for (int i = 0; i < this.objetos.length; i++) {
			if (this.objetos[i] == null) {
				this.objetos[i] = aluno;
				this.totalDeObjetos += 1;
				break;
			}
		}
	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		
		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = aluno;
		this.totalDeObjetos++;
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		
		return this.objetos[posicao];
	}
	
	public void remove(int posicao) {
		if (this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}
	
	public boolean contem(Aluno aluno) {
		
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (aluno.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}	
	
	
	private void garanteEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novoArray = new Object[this.objetos.length * 2];
			for (int i = 0;  i < this.objetos.length; i++) {
				novoArray[i] = this.objetos[i];
			}
			this.objetos = novoArray;
			
		}
	}
	
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		
		for (int i = 0; i < this.totalDeObjetos - 1; i++)
		{
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		
		
		return super.toString();
	}
	
}

