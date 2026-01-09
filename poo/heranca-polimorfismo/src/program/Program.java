package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregados;
import entities.EmpregadosTerceirizados;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 List<Empregados> empregados = new ArrayList<>();
		 
		 System.out.println("Insira o número de empregados:");
		 int n = sc.nextInt();
		 for (int i=0; i<n; i++) {
			 System.out.printf("Dados do empregado #%d:\n",i+1);
			 System.out.println("Empregado terceiriado? (S/N)");
			 String test = sc.next();
			 System.out.println("Nome:");
			 String nome = sc.next();
			 System.out.println("Horas:");
			 int horas = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Valor por hora:");
			 Double valorPorHora = sc.nextDouble();
			 sc.nextLine();
			 if (test.equalsIgnoreCase("S")) {
				 System.out.println("Valor adicional:");
				 Double valorAdicional = sc.nextDouble();
				 sc.nextLine();
				 Empregados empregado = new EmpregadosTerceirizados(nome, horas, valorPorHora, valorAdicional);
				 empregados.add(empregado);
			 }else {
				 Empregados empregado = new Empregados(nome, horas, valorPorHora);
				 empregados.add(empregado);
			 }			 
		 }
		 System.out.println("PAGAMENTOS:\n");
		 for (Empregados c : empregados) {
			 System.out.printf("%s - $ %.2f\n",c.getNome(),c.Pagamento());
		 }
		 
		 
		 
		 
		 
		 
	}

}
