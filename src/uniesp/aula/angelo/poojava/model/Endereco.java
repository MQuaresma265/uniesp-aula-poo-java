package uniesp.aula.angelo.poojava.model;

public class Endereco {
	
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String estado;
	private String pais;
	
	public Endereco(String cep, String endereco, String numero, String complemento, String bairro, String municipio,
			String estado, String pais) {
		
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", municipio=" + municipio + ", estado=" + estado + ", pais=" + pais + "]";
	}
	
	

	
}
