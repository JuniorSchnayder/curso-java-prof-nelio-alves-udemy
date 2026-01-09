package services;

import java.util.ArrayList;
import java.util.List;
//Lista tipo T qualquer
public class PrintService <T>{
	
	public List<T> list = new ArrayList<>();

	public PrintService() {
	}
	

	public void addValor(T valor) {
		list.add(valor);
	}
	
	public T primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException ("List is empty");
		}else {
		return list.get(0);
		}
	}
	
	
	public void print() {
		System.out.print("[");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			if (i == list.size()-1) {
				System.out.println("]");
			}else {
				System.out.print(", ");
			}
		}
		System.out.print("Primeiro: " + primeiro());
	}
	
}
