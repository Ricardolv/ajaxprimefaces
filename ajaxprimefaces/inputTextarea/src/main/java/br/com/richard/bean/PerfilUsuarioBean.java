package br.com.richard.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobre;

	public void atualizar() {
		System.out.println("Sobre: " + this.sobre);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public List<String> completarTexto(String consulta) {
		List<String> resultados = new ArrayList<String>();
		
		if (consulta.startsWith("Ber")) {
			resultados.add("Bernardo");
			resultados.add("Bernardino");
			resultados.add("Bernardinho");
			resultados.add("Bernardão");
			resultados.add("Bernardo Luiz");
			resultados.add("Bernardo Luiz Viana");
		}
		
		return resultados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
	
}