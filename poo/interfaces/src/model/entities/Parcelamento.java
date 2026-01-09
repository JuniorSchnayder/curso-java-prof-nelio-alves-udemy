package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
	private LocalDate datavencimento;
	private Double quantia;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcelamento(LocalDate datavencimento, Double quantia) {
		this.datavencimento = datavencimento;
		this.quantia = quantia;
	}
	public LocalDate getDatavencimento() {
		return datavencimento;
	}
	public void setDatavencimento(LocalDate datavencimento) {
		this.datavencimento = datavencimento;
	}
	public Double getQuantia() {
		return quantia;
	}
	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(datavencimento.format(fmt) + " - " + quantia );
		return sb.toString();
	}
	
}
