package apllication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;
import entities.Cursos;
import entities.Instrutores;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// criando lista Set
		Set<Alunos> set = new HashSet<>();
		// criando cursos
		Cursos A = new Cursos();
		Cursos B = new Cursos();
		Cursos C = new Cursos();
		//criando instrutor
		Instrutores instrutor = new Instrutores("Alex");

		System.out.print("Quantos alunos há no curso A?");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o ID do " + i + "° aluno:");
			Integer id = sc.nextInt();
			sc.nextLine();
			Alunos aluno = new Alunos(id);
			A.addAluno(aluno);
		}
		instrutor.addCursos(A);

		System.out.print("Quantos alunos há no curso B?");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o ID do " + i + "° aluno:");
			Integer id = sc.nextInt();
			sc.nextLine();
			Alunos aluno = new Alunos(id);
			B.addAluno(aluno);
		}
		instrutor.addCursos(B);

		System.out.print("Quantos alunos há no curso C?");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o ID do " + i + "° aluno:");
			Integer id = sc.nextInt();
			sc.nextLine();
			Alunos aluno = new Alunos(id);
			C.addAluno(aluno);
		}
		instrutor.addCursos(C);
		
		for(Cursos curso : instrutor.getCursos()) {
			set.addAll(curso.getAluno());
		}
		
		System.out.print("Total de estudantes: "+ set.size());


	}

}
