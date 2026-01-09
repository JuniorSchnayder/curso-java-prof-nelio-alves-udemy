package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Forma> forma = new ArrayList<>();

		System.out.print("Insira o número de formas:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da forma #" + i + ":");
			System.out.print("Retângulo ou Círculo (r/c)?");
			char test = sc.next().toLowerCase().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED):");
			String entrada = sc.next().toUpperCase();
			Cor cor = Cor.valueOf(entrada);
			if (test == 'r') {
				System.out.print("Altura:");
				Double altura = sc.nextDouble();
				sc.nextLine();
				System.out.print("Largura:");
				Double largura = sc.nextDouble();
				sc.nextLine();
				Forma retangulo = new Retangulo(cor, altura, largura);
				forma.add(retangulo);
			} else {
				System.out.print("Raio:");
				Double raio = sc.nextDouble();
				sc.nextLine();
				// outra forma de add na lista, passando o objeto diretamente 
				//como argumento ao invés de criar um objeto
				forma.add(new Circulo(cor, raio));
			}
		}
		sc.close();
		System.out.println("ÁREA DAS FORMAS:");
		for (Forma c : forma) {
			System.out.println(c.area());
		}

	}

}
