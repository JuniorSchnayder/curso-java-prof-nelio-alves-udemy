package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Usuarios;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Set <Object> set = new TreeSet<>();
		
		
		System.out.print("Insira o caminho completo do arquivo:");
		String caminho = sc.nextLine();
		
		try{
			BufferedReader bf = new BufferedReader(new FileReader(caminho));
			String linha = bf.readLine();
			while(linha != null) {
				String[] campos = linha.split(" ");
				Usuarios usuario = new Usuarios(campos[0],Instant.parse(campos[1]));
				set.add(usuario);
				linha = bf.readLine();
			}
			System.out.println(" Total de usuários:" + set.size());
			for (Object obj : set) {
				System.out.println(obj);
			}
			
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
