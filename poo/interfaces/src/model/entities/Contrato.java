package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private int numeroDoContrato;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Parcelamento> parcelamentos = new ArrayList<>();

	public Contrato(int numeroDoContrato, LocalDate data, Double valorTotal) {
		this.numeroDoContrato = numeroDoContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(int numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public List<Parcelamento> getParcelamento() {
		return parcelamentos;
	}

	public void adicionarParcelas(Parcelamento parcelas) {
		parcelamentos.add(parcelas);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
