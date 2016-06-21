package com.br.project.bean;

import java.util.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "Usuario")
public class ClienteBean {
	
	@Id @GeneratedValue 
	@Column(name = "id")
	private int id;

	@Column(name = "Nome") 
	private String Nome;
	
	@Column(name = "Cidade")
	private String Cidade;
	
	@Column(name = "Estado")
	private String Estado;
	
	@Column(name = "Pais")
	private String Pais;
	
	@Column(name = "Birth_Date")
	private String Birth_Date;
	
	@Column(name = "Civil")
	private String Civil;
	
	@Column(name = "Sexo")
	private String Sexo;
	
	@Column(name = "Profissao")
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
	public String getBirthdate() {
		return Birth_Date;
	}
	public void setBirthdate(String aniversario) {
		Birth_Date = aniversario;
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
