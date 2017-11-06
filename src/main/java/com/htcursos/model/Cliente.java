package com.htcursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cliente {

	@Id
	@Column(columnDefinition="text")
	private Long id;
	@NotEmpty
	private String nome;
	@NotEmpty
	private int cpf;
	@NotEmpty
	private int rg;
	@NotEmpty
	private String orgaoemissor;
	@NotEmpty
	private String profissao;
	private int menorede16;
	private int maioresde16;
	private int qtdreside;
	@NotEmpty
	private String datanascimento;
	@JoinColumn(name = "endereco_id")
	@OneToOne
	private Endereco endereco;
	@JoinColumn(name = "contato_id")
	@OneToOne
	private Contato contato;
	@JoinColumn(name = "reinvidicacao_id")
	@OneToOne
	private Reinvidicacao reinvidicacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getOrgaoemissor() {
		return orgaoemissor;
	}
	public void setOrgaoemissor(String orgaoemissor) {
		this.orgaoemissor = orgaoemissor;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getMenorede16() {
		return menorede16;
	}
	public void setMenorede16(int menorede16) {
		this.menorede16 = menorede16;
	}
	public int getMaioresde16() {
		return maioresde16;
	}
	public void setMaioresde16(int maioresde16) {
		this.maioresde16 = maioresde16;
	}
	public int getQtdreside() {
		return qtdreside;
	}
	public void setQtdreside(int qtdreside) {
		this.qtdreside = qtdreside;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Reinvidicacao getReinvidicacao() {
		return reinvidicacao;
	}
	public void setReinvidicacao(Reinvidicacao reinvidicacao) {
		this.reinvidicacao = reinvidicacao;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", orgaoemissor=" + orgaoemissor
				+ ", profissao=" + profissao + ", menorede16=" + menorede16 + ", maioresde16=" + maioresde16
				+ ", qtdreside=" + qtdreside + ", datanascimento=" + datanascimento + ", endereco=" + endereco
				+ ", contato=" + contato + ", reinvidicacao=" + reinvidicacao + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + cpf;
		result = prime * result + ((datanascimento == null) ? 0 : datanascimento.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + maioresde16;
		result = prime * result + menorede16;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((orgaoemissor == null) ? 0 : orgaoemissor.hashCode());
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + qtdreside;
		result = prime * result + ((reinvidicacao == null) ? 0 : reinvidicacao.hashCode());
		result = prime * result + rg;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (cpf != other.cpf)
			return false;
		if (datanascimento == null) {
			if (other.datanascimento != null)
				return false;
		} else if (!datanascimento.equals(other.datanascimento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maioresde16 != other.maioresde16)
			return false;
		if (menorede16 != other.menorede16)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (orgaoemissor == null) {
			if (other.orgaoemissor != null)
				return false;
		} else if (!orgaoemissor.equals(other.orgaoemissor))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (qtdreside != other.qtdreside)
			return false;
		if (reinvidicacao == null) {
			if (other.reinvidicacao != null)
				return false;
		} else if (!reinvidicacao.equals(other.reinvidicacao))
			return false;
		if (rg != other.rg)
			return false;
		return true;
	}
}
