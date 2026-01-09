package entities;

public class EmpregadosTerceirizados extends Empregados{
	public Double valorAdicional;

	

	public EmpregadosTerceirizados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpregadosTerceirizados(String nome, Integer horas, Double valorPorHora,Double valorAdicional) {
		super(nome, horas, valorPorHora);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public Double Pagamento () {
		return super.Pagamento()+valorAdicional*1.1;
	}
	
	
}
