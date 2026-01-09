package entities;

import entities.Produto;


public class OrderItem {
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public OrderItem(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}


	public OrderItem(Integer quantidade, Double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal () {
		Double total = quantidade * preco;
		return total;
	}
	
	
	
}
