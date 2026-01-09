package apllication;

import java.util.Scanner;

import services.PrintService;


public class Program {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Quantos dados deseja ler? ");
			int n = sc.nextInt();
			sc.nextLine();
			
			PrintService<String> print = new PrintService<>();
			System.out.println("Digite os dados:");
			for (int i=0; i<n; i++) {
				String valor = sc.next();
				print.addValor(valor);
			}
			print.print();
			
			
			sc.close();
	}

}
