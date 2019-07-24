package orientacaoAObjetos;

public class Funcionario {

	public String nomeFuncionario;
	public double salarioFuncionario;

	public void AumentoSalario(double valor) {
		salarioFuncionario += valor;
	}
	
	public void ConsultaDados() {
		System.out.printf("Nome: %s \nSalario: %f\n",this.nomeFuncionario,this.salarioFuncionario);
	}
	

}
