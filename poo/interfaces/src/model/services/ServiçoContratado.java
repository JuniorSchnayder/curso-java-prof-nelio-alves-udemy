package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ServiçoContratado {
	
	//INTERFACE IMPLEMENTADA POR ServiçoPaypal
	private ServiçoPagamentoOnline serviçoPagamentoOnline;
	
	
	
	public ServiçoContratado(ServiçoPagamentoOnline serviçoPagamentoOnline) {
		this.serviçoPagamentoOnline = serviçoPagamentoOnline;
	}

	public void processarContrato (Contrato contrato,Integer meses ) {
		Double parcelaBase = contrato.getValorTotal()/meses;
		for(int i=1; i<=meses;i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i);
			Double taxaJuros = serviçoPagamentoOnline.taxaJuros(parcelaBase,i);
			Double taxaPagamento = serviçoPagamentoOnline.taxaPagamento(parcelaBase+taxaJuros);
			Double finalParcela = parcelaBase + taxaJuros + taxaPagamento;
			contrato.getParcelamento().add(new Parcelamento(dataVencimento, finalParcela));
		}
		
		
		
	}
}
