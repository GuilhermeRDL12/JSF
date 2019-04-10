package br.com.fiap.bean;

import java.util.List;

public class CarrinhoBean {
	
	private List<String> listaProdutos;
	private List<String> quatidadeProduto;
	
	

	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> listaProdutos, List<String> quatidadeProduto) {
		super();
		this.listaProdutos = listaProdutos;
		this.quatidadeProduto = quatidadeProduto;
	}

	public List<String> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<String> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public List<String> getQuatidadeProduto() {
		return quatidadeProduto;
	}

	public void setQuatidadeProduto(List<String> quatidadeProduto) {
		this.quatidadeProduto = quatidadeProduto;
	}

	
	
}
