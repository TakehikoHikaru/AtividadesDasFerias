package testes;

import orientacaoAObjetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente01 = new Gerente();
		Gerente gerente02 = new Gerente();
		
		gerente01.salario = 1000;
		gerente02.salario = 1000;
		
		gerente01.AumentoSalario();
		gerente02.AumentoSalario(15);
		
		System.out.println(gerente01.salario);
		System.out.println(gerente02.salario);
		
	}

}
