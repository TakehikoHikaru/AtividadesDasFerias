package orientacaoAObjetos;

public class Conta {

	public int codConta;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;
	
	
	public Conta(int cod) {
		codConta = cod;
	}
	
	
	
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
