package testes;

import orientacaoAObjetos.Agencia;

public class TesteAgencia {

	public static void main(String[] args) {
	
		Agencia agen01 = new Agencia();
		Agencia agen02 = new Agencia();
	
		agen01.CodAgencia = 1;
		agen02.CodAgencia = 2;
			
		System.out.printf("Codigo: %d\n",agen01.CodAgencia);
		System.out.printf("\nCodigo: %d\n",agen02.CodAgencia);
	}
	
}
