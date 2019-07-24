package orientacaoAObjetos;

public class Gerente extends Funcionario{
	
	String nomeUsuario;
	String senha;
	double Bonificacao = 15;
	

	public void BonificacaoSalario() {
		setSalarioFuncionario((((getSalarioFuncionario()/100)*Bonificacao)+ getSalarioFuncionario()));
	}
	
	public void ConsultaDados() {
		System.out.printf("Nome: %s \nSalario: %f\nVale Refeicão: %f\nBonificação: %f\nNome de Usaario: %s\nSenha: %s\n",getNomeFuncionario(),getSalarioFuncionario(),getValeRefeicao(),this.Bonificacao,this.nomeUsuario,this.senha);
	}
	
	
	
	public void AumentoSalario() {
		setSalarioFuncionario(getSalarioFuncionario() + (getSalarioFuncionario()/100)*10) ;
	}

	
	public void AumentoSalario(int taxa) {
		setSalarioFuncionario(getSalarioFuncionario() + (getSalarioFuncionario()/100)*taxa) ;
	}
	
	
}
