package uniesp.aula.angelo.poojava.model;

public class Profissao {
	
	private String nome;

	public Profissao(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Profissao [nome=" + nome + "]";
	}
	
	
}
