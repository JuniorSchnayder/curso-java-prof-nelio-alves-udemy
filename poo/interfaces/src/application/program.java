package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.services.ServiçoContratado;
import model.services.ServiçoPaypal;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy):");
		String texto = sc.next();
		LocalDate data = LocalDate.parse(texto, fmt);
		System.out.print("Valor do contrato:");
		Double valorTotal = sc.nextDouble();
		sc.nextLine();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com o numero de parcelas:");
		Integer n = sc.nextInt();
		System.out.println();

		ServiçoContratado serviço = new ServiçoContratado(new ServiçoPaypal());
		
		serviço.processarContrato(contrato, n);
		
		System.out.println("Parcelas:");
		for(Parcelamento c : contrato.getParcelamento()) {
			System.out.println(c);
		}
	
		sc.close();
	}

}
