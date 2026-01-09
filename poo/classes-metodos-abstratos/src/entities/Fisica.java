package entities;

public class Fisica extends Pessoa{
	private Double gastosSaude;
	
	public Fisica() {
	}

	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	
	@Override
	public Double mostrarImposto() {
		Double abateSaude = gastosSaude*0.5;
		Double impostoFisica = 0.0;
		if (super.getRendaAnual() < 20.000 ) {
			impostoFisica = super.getRendaAnual()*0.15;
		}else {
			impostoFisica = super.getRendaAnual()*0.25;
		}
		return impostoFisica-abateSaude;
	}
	
	
	
}
