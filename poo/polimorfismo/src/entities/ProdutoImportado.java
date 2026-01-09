package entities;

public class ProdutoImportado extends Produtos {
	private Double taxa;

	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preço, Double taxa) {
		super(nome, preço);
		this.taxa = taxa;
	}



	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double preçoTotal() {
		return preço+taxa;
	}
	
	@Override
	public String priceTag(){
		return super.getNome()
				+ " $ "
				+ String.format("%.2f",preçoTotal())
				+ " (Taxa de importação: $ "
				+ taxa
				+ ")\n";
	}
}
