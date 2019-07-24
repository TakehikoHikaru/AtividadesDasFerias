package orientacaoAObjetos;

public class Conta {

	public int CodConta;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;
	
	
	public void Saque(double valor) {
		this.saldo -= valor;
	}
	
	public void Deposito(double valor) {
		this.saldo += valor;
	}
	
	public void ImpressãoDeExtrato() {
		//corpo
	}
	
	public double SaldoDisponivel() {
		return this.saldo;
	}
	
}
