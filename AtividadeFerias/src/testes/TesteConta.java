package testes;

import orientacaoAObjetos.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		System.out.println("Quantidade de objetos criados: "+Conta.qtdObjetos);
		Conta con01 = new Conta(1);
		Conta con02 = new Conta(2);
		System.out.println("Quantidade de objetos criados: "+Conta.qtdObjetos+"\n\n");
		
		//con01.codConta = 1;
		con01.limite = 1000;
		con01.saldo = 500;
		
		//con02.codConta = 2;
		con02.limite = 2000;
		con02.saldo = 100;
		
		System.out.printf("Codigo: %d\nSaldo: %f\nLimite: %f\n",con01.codConta,con01.saldo,con01.limite);
		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.codConta,con02.saldo,con02.limite);

		/*con02.Deposito(100);

		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.codConta,con02.saldo,con02.limite);

		con02.Saque(100);

		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.codConta,con02.saldo,con02.limite);
		*/
		
		Conta.TraferenciaEntreContas(100, con01, con02);
		
		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con01.codConta,con01.saldo,con01.limite);
		System.out.printf("\nCodigo: %d\nSaldo: %f\nLimite: %f\n",con02.codConta,con02.saldo,con02.limite);
	}

}
