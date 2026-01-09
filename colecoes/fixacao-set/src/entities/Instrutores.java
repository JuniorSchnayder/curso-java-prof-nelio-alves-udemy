package entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutores {
	private String nome;
	private List<Cursos> cursos = new ArrayList<>();
	
	public Instrutores () {
		
	}

	public Instrutores(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void addCursos(Cursos cursos) {
		this.cursos.add(cursos);
	}
	
	
 }
