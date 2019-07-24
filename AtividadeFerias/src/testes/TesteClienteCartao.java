package testes;

import orientacaoAObjetos.CartaoDeCredito;
import orientacaoAObjetos.Cliente;

public class TesteClienteCartao {

	public static void main(String[] args) {
	
		CartaoDeCredito cardA = new CartaoDeCredito(11);
		Cliente cliA = new Cliente();
		
		cliA.nomeCliente = "jamilto";
		cardA.cliente = cliA;
		
		System.out.println(cardA.cliente.nomeCliente);
		
	}

}
