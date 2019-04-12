package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	
	private String login;
	private String senha;
	private boolean termo;
	
	public String logar() {
		if("guilherme".equals(getLogin()) && "1234".equals(getSenha())) {
			System.out.println("Usu�rio logado: " + getLogin());
			System.out.println(isTermo());
			return "carrinho";
		}else {
			System.out.println("Usu�rio n�o autorizado");
			return "login";
		}
		
	}
	
	public LoginBean() {
		super();
	}

	public LoginBean(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	
	
	

}
