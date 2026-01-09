package model.services;

public class ServiçoPaypal implements ServiçoPagamentoOnline{

	@Override
	public Double taxaPagamento(Double quantia) {
		return 0.02*quantia;
	}

	@Override
	public Double taxaJuros(Double quantia,Integer meses) {
		return  0.01*meses*quantia;
	}
		

}
