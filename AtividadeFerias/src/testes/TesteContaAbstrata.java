package testes;

import polimorfismo.ContaGenerica;
import polimorfismo.ContaPoupanca;

public class TesteContaAbstrata {

	public static void main(String[] args) {
		
		ContaGenerica con1 = new ContaPoupanca();

		con1.GerarExtratoDetalhado();
		
	}

}
