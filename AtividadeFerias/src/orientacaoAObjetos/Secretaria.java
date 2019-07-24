package orientacaoAObjetos;

public class Secretaria extends Funcionario{

	int numRamal;
	
	@Override
	public void ConsultaDados() {
		System.out.printf("Nome: %s \nSalario: %f\nVale Refeicão: %f\nBonificação: %f\nNumero Ramal: %d\n",getNomeFuncionario(),getSalarioFuncionario(),getValeRefeicao(),this.Bonificacao,this.numRamal);
		
	}
}
