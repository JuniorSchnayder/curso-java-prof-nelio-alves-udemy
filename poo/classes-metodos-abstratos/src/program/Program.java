package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Digite o número de contribuintes:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= 3; i++) {
			System.out.print("Dados do contribuinte nº" + i + ":");
			System.out.print("Pessoa física ou Jurídica (f/j)?");
			char teste = sc.next().toLowerCase().charAt(0);
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Renda anual:");
			Double rendaAnual = sc.nextDouble();
			sc.nextLine();
			if (teste == 'f') {
				System.out.print("Gastos com saúde:");
				Double gastosSaude = sc.nextDouble();
				sc.nextLine();
				Pessoa pessoa = new Fisica(nome, rendaAnual, gastosSaude);
				pessoas.add(pessoa);
			} else {
				System.out.print("Número de funcionérios:");
				int numeroFuncionarios = sc.nextInt();
				sc.nextLine();
				pessoas.add(new Juridica(nome, rendaAnual, numeroFuncionarios));
			}			
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		Double impostoTotal = 0.0;
		for (Pessoa p : pessoas) {
			System.out.printf("%S: $ %.2f%n",p.getNome(),p.mostrarImposto());
			impostoTotal += p.mostrarImposto();
		}
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS: $ %.2f",impostoTotal);
		sc.close();
		
	}

}
