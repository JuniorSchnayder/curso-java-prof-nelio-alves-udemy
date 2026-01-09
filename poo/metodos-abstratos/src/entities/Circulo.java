package entities;

import entities.enums.Cor;

public class Circulo extends Forma{
	private Double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double area() {
		return 3.14*(raio*raio);
	}
	
	
	
}
