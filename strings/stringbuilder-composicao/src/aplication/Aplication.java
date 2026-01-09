package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Pedido;
import entities.Produto;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira os dados do cliente:");
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Data de aniversário (DD/MM/YYYY):");
		Date birth = sdf.parse(sc.next());
		Cliente cliente = new Cliente(name,email,birth);
		
		System.out.println("Insira os dados do pedido:");
		System.out.println("Status:");
		String statusSc = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusSc);
		Date momentoAtual = new Date();
		Pedido pedido = new Pedido(momentoAtual, status, cliente);
		
		System.out.println("Quantos itens há neste pedido?:");
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			System.out.println("Insira os dados do "+ i + "° item:");
			System.out.println("Nome do produto:");
			String nameP = sc.next();
			System.out.println("Preço do produto:");
			Double precoP = sc.nextDouble();
			Produto produto = new Produto(nameP, precoP);
			System.out.println("Quantidade do produto:");
			int quantP = sc.nextInt();
			OrderItem item = new OrderItem (n, precoP, produto);
			pedido.addItem(item);
		}
		System.out.println(pedido);


		
		
		
	}

}
