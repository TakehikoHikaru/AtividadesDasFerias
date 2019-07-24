package testes;

import orientacaoAObjetos.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta con01 = new Conta();
		Conta con02 = new Conta();

		con01.CodConta = 1;
		con01.limite = 1000;
		con01.saldo = 500;
		
		con02.CodConta = 2;
		con02.limite = 2000;
		con02.saldo = 100;
		
		System.out.printf("Codigo: %d\nSaldo: %f\nLimite: %f\n",con01.CodConta,con01.saldo,con01.limite);
		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.CodConta,con02.saldo,con02.limite);

		con02.Deposito(100);

		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.CodConta,con02.saldo,con02.limite);

		con02.Saque(100);

		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.CodConta,con02.saldo,con02.limite);

	}

}
