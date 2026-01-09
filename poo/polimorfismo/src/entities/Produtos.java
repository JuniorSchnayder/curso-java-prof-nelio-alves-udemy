package entities;

public class Produtos {
	protected String nome;
	protected Double preço;
	
	public Produtos() {
	}
	
	public Produtos(String nome, Double preço) {
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public String priceTag(){
		return nome + " $ " + String.format("%.2f",preço) + "\n";
	}
	
	
	
}
