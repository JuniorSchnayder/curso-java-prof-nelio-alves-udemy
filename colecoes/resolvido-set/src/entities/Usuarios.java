package entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

public class Usuarios implements Comparable<Usuarios> {

	private String nome;
	private Instant dataAcesso;
	
	public Usuarios () {
		
	}

	public Usuarios(String nome, Instant dataAcesso) {
		this.nome = nome;
		this.dataAcesso = dataAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getDataAcesso() {
		return dataAcesso;
	}

	public void setDataAcesso(Instant dataAcesso) {
		this.dataAcesso = dataAcesso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Usuarios other) {
		return this.getNome().compareTo(other.getNome());
	}

	@Override
	public String toString() {
		return "Usuarios [nome=" + nome + ", dataAcesso=" + dataAcesso + "]";
	}
	
	
	
	
	
	
	
}
