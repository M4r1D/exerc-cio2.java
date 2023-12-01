package exercicio_2;

public class Teste {
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor();
		
		f1.endereco =" Setor Oeste Rua das graça Cj 1 casa 345";
		f1.nome = "Gilberto";
		f1.telefone ="2791018112";
		f1.valorCredito = 9.000;
		f1.valorDivida = 1.800;
		f1.obterSaldo(7.200);
		
		System.out.println("Nome:" + f1.nome
				           + "\nEndereço:" + f1.endereco
				           + "\nTelefone:" + f1.telefone
				           + "\nCredito:" + f1.valorCredito
				           + "\nDivida:" + f1.valorDivida
				           + "\nSaldo Atual:" + f1.obterSaldo(7.200) );
	}
}
