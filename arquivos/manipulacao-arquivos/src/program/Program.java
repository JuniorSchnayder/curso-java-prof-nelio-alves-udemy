package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Resumo;

public class Program {

	public static void main(String[] args) {

		String arquivo = "C:\\Users\\kimbe\\Documents\\produtos.CSV";
		File pasta = new File(arquivo);
		
		boolean success = new File(pasta.getParent()+ "\\out").mkdir();
		String arquivoDeDestino = pasta.getParent()+ "\\out\\summary.csv";
		List<Resumo> list = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader (new FileReader(arquivo))){
			String linha = br.readLine();
			
			
			while (linha != null) {
				String[] dados = linha.split(",");
				String nome = dados[0];
				Double preco = Double.parseDouble(dados[1]);
				Double quantidade = Double.parseDouble(dados[2]);
				list.add(new Resumo(nome, preco, quantidade));
				linha = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter (new FileWriter(arquivoDeDestino))){
				
				for (Resumo lista : list) {
					bw.write(lista.getNome()+", "+ lista.valorTotal());
					bw.newLine();
				}
				
				System.out.println(arquivoDeDestino + " CRIADO!");
			} catch (IOException e) {
				System.out.println("Erro de escrita:"+ e.getMessage());
			}
			
			
			
		} catch (IOException e) {
			System.out.println("Erro de leitura:"+ e.getMessage());
		}
		
	}

}
