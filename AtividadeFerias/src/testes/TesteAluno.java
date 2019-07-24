package testes;

import orientacaoAObjetos.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		
		Aluno alu01 = new Aluno();
		Aluno alu02 = new Aluno();
		
		alu01.nomeAluno = "Aluno1";
		alu01.rgAluno = "11111111-11";
		alu01.DataNascAluno = "11/11/11";
		

		alu02.nomeAluno = "Aluno2";
		alu02.rgAluno = "22222222-22";
		alu02.DataNascAluno = "12/12/12";
		
		System.out.printf("Nome: %s\nRG: %s\nData Nascimento: %s\n",alu01.nomeAluno,alu01.rgAluno,alu01.DataNascAluno);
		System.out.printf("\nNome: %s\nRG: %s\nData Nascimento: %s\n",alu02.nomeAluno,alu02.rgAluno,alu02.DataNascAluno);
		
		
		
		
		
		
		
	}

}
