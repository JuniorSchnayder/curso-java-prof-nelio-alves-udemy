package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Número do quarto:");
		Integer numeroDoQuarto = sc.nextInt();
		sc.nextLine();
		System.out.print("Data de check-in (dd/MM/yyyy): ");
		String data = sc.nextLine();
		LocalDate checkin = LocalDate.parse(data,formato);
		System.out.print("Data de check-out (dd/MM/yyyy): ");
		String data2 = sc.nextLine();
		LocalDate checkout = LocalDate.parse(data2,formato);
		Reserva reserva = new Reserva(numeroDoQuarto, checkin, checkout);
		System.out.println(reserva);
		System.out.println();

		
		System.out.println("INSIRA A DATA PARA ATUALIZAR A RESERVA:");
		System.out.print("Data de Check-in (dd/MM/yyy):");
		data = sc.nextLine();
		checkin = LocalDate.parse(data,formato);
		System.out.print("Data de Check-out (dd/MM/yyy):");
		data2 = sc.nextLine();
		checkout = LocalDate.parse(data2,formato);
		reserva.atualizarDatas(checkin, checkout);
		System.out.print(reserva);
		System.out.println();

		
		
		
		
		
		sc.close();
	}

}
