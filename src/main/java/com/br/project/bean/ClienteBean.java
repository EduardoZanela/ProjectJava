package com.br.project.bean;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "NOTE")
public class ClienteBean {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String Nome;
	
	@Column(name = "Cidade")
	private String Cidade;
	
	@Column(name = "Estado")
	private String Estado;
	
	@Column(name = "Pais")
	private String Pais;
	
	@Column(name = "Birth_Date")
	private Date Aniversario;
	
	@Column(name = "Civil")
	private String Civil;
	
	private String Sexo;
	private String Profissao;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public Date getAniversario() {
		return Aniversario;
	}
	public void setAniversario(Date aniversario) {
		Aniversario = aniversario;
	}
	public String getCivil() {
		return Civil;
	}
	public void setCivil(String civil) {
		Civil = civil;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	
	
}
