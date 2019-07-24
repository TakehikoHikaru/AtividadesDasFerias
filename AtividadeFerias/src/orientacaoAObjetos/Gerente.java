package orientacaoAObjetos;

public class Gerente {

	String nome;
	public double salario;
	
	
	
	public void AumentoSalario() {
		
		this.salario += (this.salario/100)*10;
	}

	
	public void AumentoSalario(int taxa) {
		this.salario += (this.salario/100)*taxa;
	}
	
	
}
