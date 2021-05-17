package br.senai.cadastroEnderecos.dto;

public class DadosEnderecoDTO {
	private String rua;
	private String cidade;
	private String estado;
	
	public DadosEnderecoDTO(String rua, String cidade, String estado) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public DadosEnderecoDTO() {
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
