package orientacaoAObjetos;

public class Funcionario {



	private String nomeFuncionario;
	private double salarioFuncionario = 1000;
	private double valeRefeicao;

	public void AumentoSalario(double valor) {
		salarioFuncionario += valor;
	}
	
	public void ConsultaDados() {
		System.out.printf("Nome: %s \nSalario: %f\nVale Refeicão: %f\n",this.nomeFuncionario,this.salarioFuncionario,this.valeRefeicao);
	}
	
	
	public void AjustaTaxaValeRefeicao(double taxa) {
		valeRefeicao += ((valeRefeicao/100)*taxa);
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}
}
