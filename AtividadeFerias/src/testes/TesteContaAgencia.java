package testes;

import orientacaoAObjetos.Agencia;
import orientacaoAObjetos.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {
		
		Agencia age01 = new Agencia(100);
		Conta con01 = new Conta();
		
		//age01.CodAgencia = 100;
		con01.agencia = age01;

		System.out.println(con01.agencia.CodAgencia);
	}

}
