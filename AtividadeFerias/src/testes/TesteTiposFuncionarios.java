package testes;

import orientacaoAObjetos.Gerente;
import orientacaoAObjetos.Secretaria;
import orientacaoAObjetos.Telefonista;

public class TesteTiposFuncionarios {

	public static void main(String[] args) {
		
		Secretaria secre = new Secretaria();
		Gerente gere = new Gerente();
		Telefonista tele = new Telefonista();

	
	secre.setSalarioFuncionario(1000);
	gere.setSalarioFuncionario(1000);
	secre.BonificacaoSalario();
	gere.BonificacaoSalario();
	secre.ConsultaDados();
	gere.ConsultaDados();
	
	
	}
}
