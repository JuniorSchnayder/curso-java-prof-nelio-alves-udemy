package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produtos{
	private Date dataFabricaçao;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	public ProdutoUsado() {
	
	}

	public ProdutoUsado(String nome, Double preço, Date dataFabricaçao) {
		super(nome, preço);
		this.dataFabricaçao = dataFabricaçao;
	}

	public Date getDataFabricaçao() {
		return dataFabricaçao;
	}

	public void setDataFabricaçao(Date dataFabricaçao) {
		this.dataFabricaçao = dataFabricaçao;
	}
	
	@Override
	public String priceTag(){
		return super.getNome()
				+ " (usado) $ "
				+ String.format("%.2f",super.getPreço())
				+ " (Data de fabricação: "
				+ sdf.format(dataFabricaçao)
				+ ")\n";
	}
	
	
}
