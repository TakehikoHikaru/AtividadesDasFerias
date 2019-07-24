package testes;

import orientacaoAObjetos.Aluno;
import orientacaoAObjetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) {
		
		Turma tur01 = new Turma();
		Aluno alu01 = new Aluno();
		
		tur01.serie = 3;
		alu01.turma = tur01;
		
		System.out.println(alu01.turma.serie);
		
		

	}

}
