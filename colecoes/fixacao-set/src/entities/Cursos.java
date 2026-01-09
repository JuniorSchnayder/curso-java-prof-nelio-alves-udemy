package entities;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
	
	private static List<Alunos> aluno = new ArrayList<>();
	
	public Cursos () {
		
	}
	
	
	public void addAluno(Alunos aluno) {
		this.aluno.add(aluno);
	}
	

	public static List<Alunos> getAluno() {
		return aluno;
	}

	
	
	
	
}
