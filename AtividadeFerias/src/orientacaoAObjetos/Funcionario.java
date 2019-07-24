package orientacaoAObjetos;

public class Funcionario {

	public String nomeFuncionario;
	public double salarioFuncionario = 1000;
	public double valeRefeicao;

	public void AumentoSalario(double valor) {
		salarioFuncionario += valor;
	}
	
	public void ConsultaDados() {
		System.out.printf("Nome: %s \nSalario: %f\n",this.nomeFuncionario,this.salarioFuncionario);
	}
	

}
