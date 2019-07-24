package testes;

import orientacaoAObjetos.CartaoDeCredito;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
	
		CartaoDeCredito Card01 = new CartaoDeCredito();
		CartaoDeCredito Card02 = new CartaoDeCredito();
		
		Card01.codCartao = 0001;
		Card02.codCartao = 0002;
		
		Card01.dataVali = "11/11/11";
		Card02.dataVali = "22/22/22";
		
		System.out.printf("Codigo: %d\nData de Validade: %s\n",Card01.codCartao,Card01.dataVali);
		System.out.printf("\nCodigo: %d\nData de Validade: %s\n",Card02.codCartao,Card02.dataVali);
		
		
	}

}
