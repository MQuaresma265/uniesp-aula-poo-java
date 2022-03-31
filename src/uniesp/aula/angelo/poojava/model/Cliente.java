package uniesp.aula.angelo.poojava.model;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
	
	private String codigo;
	private Profissao profissao;

	public Cliente(String nome, Date dataNascimento, Endereco endereco, List<Telefone> telefones, Cargo cargo,
			String codigo, Profissao profissao) {
		super(nome, dataNascimento, endereco, telefones, cargo);
		this.codigo = codigo;
		this.profissao = profissao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "[codigo=" + codigo + ", profissao=" + profissao + "]";
	}
	
	
}
