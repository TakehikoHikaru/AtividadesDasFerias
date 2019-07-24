package testes;

import orientacaoAObjetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario fun01 = new Funcionario();
		Funcionario fun02 = new Funcionario();
		
		fun01.nomeFuncionario = "Funcionario01";
		fun01.salarioFuncionario = 1111.1;
		fun01.valeRefeicao = 300;
		
		fun02.nomeFuncionario = "Funcionario02";
		fun02.salarioFuncionario = 2222.2;
		fun02.valeRefeicao = 500;
		
		
		fun02.AumentoSalario(4444.4);
		
		fun01.ConsultaDados();
		fun02.ConsultaDados();
		
		fun02.AjustaTaxaValeRefeicao(10);
		System.out.println(fun02.valeRefeicao);
		
		
		
		
		
		//System.out.printf("Nome: %s\nSalario: %f\n",fun01.nomeFuncionario,fun01.salarioFuncionario);
		//System.out.printf("\nNome: %s\nSalario: %f\n",fun02.nomeFuncionario,fun02.salarioFuncionario);
		
		
	}

}
