package orientacaoAObjetos;

public class Gerente extends Funcionario{
	
	String nomeUsuario;
	String senha;
	
	public void AumentoSalario() {
		setSalarioFuncionario(getSalarioFuncionario() + (getSalarioFuncionario()/100)*10) ;
	}

	
	public void AumentoSalario(int taxa) {
		setSalarioFuncionario(getSalarioFuncionario() + (getSalarioFuncionario()/100)*taxa) ;
	}
	
	
}
