package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reserva {
	private Integer numeroDoQarto;
	private LocalDate checkin;
	private LocalDate checkout;
	
	DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Reserva () {
		
	}

	public Reserva(Integer numeroDoQarto, LocalDate checkin, LocalDate checkout) {
		this.numeroDoQarto = numeroDoQarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroDoQarto() {
		return numeroDoQarto;
	}

	public void setNumeroDoQarto(Integer numeroDoQarto) {
		this.numeroDoQarto = numeroDoQarto;
	}

	public LocalDate getCheckin() {
		return checkin;
	}


	public LocalDate getCheckout() {
		return checkout;
	}

	public long duration() {
		long diferenca = ChronoUnit.DAYS.between(checkin, checkout);
		return diferenca;
	}
	
	public void atualizarDatas(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Reserva: "
			+"Quarto "
			+numeroDoQarto
			+", check-in: "
			+checkin.format(formatoSaida)
			+", chec-out: "
			+checkout.format(formatoSaida)
			+", "
			+duration()
			+" noites";	
	}
	/*usar no main
	System.out.println("INSIRA A DATA PARA ATUALIZAR A RESERVA:");
	System.out.print("Data de Check-in:");*/
	

}
