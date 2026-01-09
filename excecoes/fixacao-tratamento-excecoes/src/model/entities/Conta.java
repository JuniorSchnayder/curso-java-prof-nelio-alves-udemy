package model.entities;

import model.exceptions.MinhaException;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta () {
		
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void deposit(Double quantia) {
		saldo += quantia;
	}
	
	public void saque(Double quantia){
		if (quantia > limiteSaque) {
			throw new MinhaException("O valor excede o limite de saque");
		}
		if (quantia > saldo) {
			throw new MinhaException("Saldo insuficiente");
		}
		
		saldo -= quantia;
	}
	
	@Override
	public String toString() {
		return String.format("Novo saldo: %.2f",saldo);
	}
	
}
