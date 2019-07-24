package testes;

import Util.Teclado;
import orientacaoAObjetos.Funcionario;

public class TesteFuncionario2 {

	public static void main(String[] args) {
			
			Funcionario funcionario_1 = new Funcionario();
			
			funcionario_1.setNomeFuncionario(Teclado.lerTexto("Digite o nome do funcionario: "));
			
			
			int num;
			while(1<2) {
				num = Teclado.lerInt("\nVer status do funcionario(1)\nAlterar nome do funcionario(2)\nAlterar salario do funcionario(3)\nSair(4)");
				
				switch (num) {
				
				case 1:
				funcionario_1.ConsultaDados();
				break;
				
				case 2:
				funcionario_1.setNomeFuncionario(Teclado.lerTexto("Digite o nome do funcionario: "));
				break;
			
				case 3:
				funcionario_1.setSalarioFuncionario(Teclado.lerDouble("Digite o novo salario: "));
				break;
				
				case 4:
				break;
				
				default:
					System.out.println("Erro");
				
				}
				if(num == 4) {
					break;
				}
			}
	}
}
