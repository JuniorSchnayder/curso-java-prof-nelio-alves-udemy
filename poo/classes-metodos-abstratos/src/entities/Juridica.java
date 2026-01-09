package entities;

public class Juridica extends Pessoa {
	public int numeroFuncionarios;
	
	public Juridica () {
		
	}

	public Juridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double mostrarImposto() {
		Double impostoJuridica = 0.0;
		if (numeroFuncionarios <= 10 ) {
			impostoJuridica = super.getRendaAnual()*0.16;
		}else {
			impostoJuridica = super.getRendaAnual()*0.14;
		}
		return impostoJuridica;
	}
	
}
