package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String caminho = "C:\\Users\\kimbe\\Desktop\\in.txt";

		List<Produtos> list = new ArrayList<>();

		// leitura do arquivo .CSV
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] vet = linha.split(",");
				String nome = vet[0];
				Double preco = Double.parseDouble(vet[1]);
				Produtos prod = new Produtos(nome, preco);
				list.add(prod);
				linha = br.readLine();
			}
			//com list.size() fica assim:
			//double media = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / list.size();
			double soma = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y);

			// preço médio dos produtos da lista
			double pm = soma / list.size();
			List<String> nomesPmMenor = list.stream().filter(x -> x.getPreco() < pm).map(x -> x.getNome())
					.collect(Collectors.toList());
			System.out.printf("Preço médio: %.2f\n", pm);

			// lambda para imprimir a lista em ordem decrescente
			nomesPmMenor.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

}
