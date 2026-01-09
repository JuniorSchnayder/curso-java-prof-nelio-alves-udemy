package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static SimpleDateFormat sdfTime = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

	private Date momento;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Cliente cliente;

	public Pedido() {

	}

	public Pedido(Date momento, OrderStatus status) {
		this.momento = momento;
		this.status = status;
	}
	
	

	public Pedido(Date momento, OrderStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Cliente getCLiente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem (OrderItem orderItem) {
		items.add(orderItem);
	}
	
	public void removeItem (OrderItem orderItem) {
		items.remove(orderItem);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem c : items) {
			sum += c.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: "+ sdfTime.format(getMomento())+"\n");
		sb.append("Order status:" + status + "\n");
		sb.append("Client: " + cliente.getName() + " (" + sdf.format(cliente.getBirthDate()) + ") - "+ cliente.getEmail()+ "\n");
		sb.append("Order items:\n");
		for (OrderItem c : items) {
			sb.append(c.getProduto().getName() + ", R$ " + c.getProduto().getPrice() + ", Quantidade: " + c.getQuantidade() + ", Subtotal: R$" + c.subTotal()+ "\n");
		}
		sb.append("Total price: R$" + total());
		return sb.toString();
	}
	
	
}
