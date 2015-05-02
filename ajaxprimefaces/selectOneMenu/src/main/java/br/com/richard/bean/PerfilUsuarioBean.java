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
	
	public static final List<Interesse> INTERESSES =  new ArrayList<Interesse>();
	
	static {
		INTERESSES.add(new Interesse("Cinema", "cinema"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Esportes", "esportes"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}

	private String nome;
	private String profissao;
	private Interesse interesse;
	private String estado;
	private String cidade;
	
	private List<String> estados = new ArrayList<String>();
	private List<String> cidades = new ArrayList<String>();

	public PerfilUsuarioBean() {
		
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
	}
	
	public void carregarCidades() {
		cidades.clear();
		switch (estado) {
		case "MG":
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
			cidades.add("Santa luzia");
			break;
		case "SP":
			cidades.add("Campinas");
			cidades.add("Santos");
			break;
		case "RJ":
			cidades.add("Ipanema");
			cidades.add("Niteroi");
			break;
		}
		
	}

	public void atualizarPerfilUsuario() {
		System.out.println("Profissão: " + this.profissao);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public void atualizarPerfilUsuarioFiltro() {
		System.out.println("Interesse: " + this.interesse.getDescricao());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public void atualizarPerfilUsuarioDependente() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}

	public List<Interesse> getInteresses() {
		return INTERESSES;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}
}