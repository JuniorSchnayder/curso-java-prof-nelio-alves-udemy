package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String caminho = "C:\\Users\\kimbe\\Desktop\\in.txt";
		List<Funcionarios> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader (new FileReader(caminho))){
			String linha = br.readLine();
			while(linha!= null){
				String[] vet = linha.split(",");
				Funcionarios func = new Funcionarios(vet[0], vet[1],Double.parseDouble(vet[2]));
				list.add(func);
				linha = br.readLine();
			}
			
			System.out.print("Digite o salário: ");
			Double salarioBase = sc.nextDouble();
			sc.nextLine();
			//stream que filtra os salario da lista que são maiores que o salario base
			List<String> salarioMaior = list.stream()
					.filter(p -> p.getSalario() > salarioBase)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			System.out.printf("Emails de pessoas cujo salário é maior que %.2f:\n",salarioBase);
			salarioMaior.forEach(System.out::println);
			
			//stream que soma os salários dos funcionários cujo nome começa com a letra 'M'
			Double somaM = list.stream()
					.filter(p -> p.getNome().charAt(0) == 'M')
					.map(p -> p.getSalario() )
					.reduce(0.0, (x,y) -> x + y);
			System.out.printf("Soma dos salários dos funcionários cujo nome começa com a letra 'M': %.2f\n", somaM);
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
			
	}

}
