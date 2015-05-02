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
	private String pais;

	private List<String> paises = new ArrayList<String>();

	public PerfilUsuarioBean() {
		paises.add("Alemanha");
		paises.add("Argentina");
		paises.add("Argélia");
		paises.add("EUA");
		paises.add("Espanha");
		paises.add("Brasil");
		paises.add("Bolivia");
		paises.add("Holanda");
		paises.add("Japão");
	}

	public List<String> sugerirPaises(String consulta) {
		List<String> resultdo = new ArrayList<String>();

		for (String pais : this.paises) {
			if (pais.toLowerCase().startsWith(consulta.toLowerCase())) {
				resultdo.add(pais);
			}
		}

		return resultdo;
	}

	public void atualizar() {
		System.out.println("País" + this.pais);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}