package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	
	private String quantidade;
	private String formaPagamento;
	private List<String> listaSelecionados;
	
	public void comprarProduto() {
		for(String valor : listaSelecionados) {
			System.out.println(valor);
		}
		
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma Pagamento: " + getFormaPagamento());
	}
	
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "Notebook Sony"));
		produtos.add(new Produto(2, "Tablet Samsung"));
		produtos.add(new Produto(3, "Smartwatch Apple"));
		
		return produtos;
		
		
	}

	
	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> listaProdutos, String quantidade, String formaPagamento,
			List<String> listaSelecionados) {
		super();
		this.quantidade = quantidade;
		this.formaPagamento = formaPagamento;
		this.listaSelecionados = listaSelecionados;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}
		
	
	
}
