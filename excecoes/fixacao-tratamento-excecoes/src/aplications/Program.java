package aplications;

import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.MinhaException;

public class Program {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);

			System.out.println("INSIRA OS DADOS DA CONTA:");
			System.out.print("Número:");
			Integer numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular:");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial:");
			Double saldo = sc.nextDouble();
			sc.nextLine();
			System.out.print("Limite de saque:");
			Double limiteSaque = sc.nextDouble();
			sc.nextLine();

			Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		
			System.out.println();
			try {
				System.out.print("Insira o valor para saque:");
				conta.saque(sc.nextDouble());
				sc.nextLine();
				System.out.print(conta);
			}
			catch (MinhaException e) {
				System.out.print("Erro de saque: "+e.getMessage());
			}
			
			sc.close();




		
	}

}
