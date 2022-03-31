package uniesp.aula.angelo.poojava.model;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
	
	private Integer matricula;
	private Double salario;
	private Date dataAdmissao;
			
	
	public Funcionario(String nome, Date dataNascimento, Endereco endereco, List<Telefone> telefones, Cargo cargo,
			Integer matricula, Double salario, Date dataAdmissao) {
		super(nome, dataNascimento, endereco, telefones, cargo);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + "]";
	}
	
	
}
