package model.services;

public interface ServiçoPagamentoOnline {
	Double taxaPagamento (Double quantia);
	Double taxaJuros (Double quantia, Integer meses);
}
