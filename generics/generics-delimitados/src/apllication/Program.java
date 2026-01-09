package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produtos;
import services.ServicoCalculo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produtos> lista = new ArrayList<>();
		String caminho = "C:\\Users\\kimbe\\Desktop\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] campo = linha.split(",");
				lista.add(new Produtos(campo[0], Double.parseDouble(campo[1])));
				linha = br.readLine();
			}
			
			Produtos maior = ServicoCalculo.max(lista);
			
			System.out.println("Mais caro:");
			System.out.println(maior);
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
