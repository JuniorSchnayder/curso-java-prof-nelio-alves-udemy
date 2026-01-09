package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ProdutoImportado;
import entities.ProdutoUsado;
import entities.Produtos;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produtos> produtos = new ArrayList<>();

		System.out.print("Digite o número de produtos:");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char tipo = Character.toLowerCase(sc.next().charAt(0));
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Preço:");
			Double preço = sc.nextDouble();
			sc.nextLine();
			if (tipo == 'i') {
				System.out.print("Taxa:");
				Double taxa = sc.nextDouble();
				sc.nextLine();
				Produtos produto = new ProdutoImportado(nome, preço, taxa);
				produtos.add(produto);
			} else {
				if(tipo == 'u') {
					System.out.print("Data de fabricação (DD/MM/YYY):");
					String data = sc.nextLine();
					Date dataFabricaçao = sdf.parse(data);
					Produtos produto = new ProdutoUsado(nome, preço, dataFabricaçao);
					produtos.add(produto);
				}else {
					Produtos produto = new Produtos(nome, preço);
					produtos.add(produto);
				}
			}

		}
		System.out.println();
		System.out.println("ETIQUETA DE PREÇOS:"); 
		for (Produtos c : produtos) {
			System.out.print(c.priceTag());
		}

	}

}
