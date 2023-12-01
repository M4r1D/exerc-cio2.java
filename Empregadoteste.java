package exercicio_2;

public class Empregadoteste {
	public static void main() {
		Empregado e1 = new Empregado();
		
		e1.codigoSetor = 2;
		e1.endereco = "Rua chaves gonçalves Q54 casa 110";
		e1.imposto = 800;
		e1.nome = "Jubileu";
		e1.salario = 1000;
		e1.telefone = "18291821";
		e1.calcularSalario();
		
		System.out.println("Nome:" + e1.nome
		           + "\nEndereço:" + e1.endereco
		           + "\nTelefone:" + e1.telefone
		           + "\nSalário:" + e1.salario
		           + "\nImposto:" + e1.imposto
		           + "\nSaldo Atual:" + e1.calcularSalario() );
	}

}
