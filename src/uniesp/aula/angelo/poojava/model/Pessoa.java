package uniesp.aula.angelo.poojava.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
	

	private String nome;
	private Date dataNascimento;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();
	private Cargo cargo;
	
	public Pessoa(String nome, Date dataNascimento, Endereco endereco, List<Telefone> telefones, Cargo cargo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefones = telefones;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", telefones="
				+ telefones + ", cargo=" + cargo + "]";
	}
	
	
	
	

}
