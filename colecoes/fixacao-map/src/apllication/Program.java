package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		Map<String, Integer> votos = new LinkedHashMap<>();
		String caminho = "C:\\Users\\kimbe\\Desktop\\in.txt";

		try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {
			String linha = bf.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				Integer quantVotos = Integer.valueOf(campos[1]);
				if (votos.containsKey(nome)) {
					votos.put(nome, votos.get(nome) + quantVotos);
				} else {
					votos.put(nome, quantVotos);
				}
				linha = bf.readLine();
			}
			for(Map.Entry<String, Integer> entry : votos.entrySet()) {
				System.out.println(entry.getKey()+": "+ entry.getValue());
			}
			

		} catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

}
