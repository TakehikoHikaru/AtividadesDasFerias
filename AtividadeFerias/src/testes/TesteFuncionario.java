package testes;

import orientacaoAObjetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario fun01 = new Funcionario();
		Funcionario fun02 = new Funcionario();
		

		fun01.setNomeFuncionario("alano");
		fun01.setSalarioFuncionario(3333);
		fun01.setValeRefeicao(300);
		
		fun02.setNomeFuncionario("aline");
		fun02.setSalarioFuncionario(1000);
		fun02.setValeRefeicao(400);
		
		fun02.AumentoSalario(4444.4);
		
		fun01.ConsultaDados();
		fun02.ConsultaDados();
		//Já fiz antes
		
		fun02.AjustaTaxaValeRefeicao(10);
		System.out.println(fun02.getValeRefeicao());
		

		fun01.RegistraEntrada("11/02/2011");
		fun01.RegistraSaida("11/02/2012");
		
		fun02.RegistraEntrada("12/02/2011");
		fun02.RegistraSaida("15/12/2011");
		
		
		
		//System.out.printf("Nome: %s\nSalario: %f\n",fun01.nomeFuncionario,fun01.salarioFuncionario);
		//System.out.printf("\nNome: %s\nSalario: %f\n",fun02.nomeFuncionario,fun02.salarioFuncionario);
		
		
	}

}
