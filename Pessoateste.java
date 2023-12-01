package exercicio_2;

public class Pessoateste {
	public static void main(String[] args) {
		Cliente p2 = new Cliente();
		Gerente p3 = new Gerente();
		Vendedor p4 = new Vendedor();
		

		p2.nome = "Giovanna";
		p3.nome = "Alexandre";
		p4.nome = "Vitoria";
		

		p2.idade = 28;
		p3.idade = 24;
		p4.idade = 25;
		

		p2.sexo = "feminino";
		p3.sexo = "masculino";
		p4.sexo = "feminino";
		
		p2.anoNasci = 1995;
		p2.valorDivida = 2.345;
		
		p3.matricula = "m1728d";
		p3.salario = 2.400;
		p3.nomeGerencia = "marketing";
		p3.ValorInss(1.212);
		
		p4.matricula = "m2817d";
		p4.salario = 1.200;
		p4.qtdVendas = 125;
		p4.valorVendas = 50.00;
		
		System.out.println(p2.toString()+ "\nValor divida: " + p2.valorDivida+ "\nAno nascimento: " + p2.anoNasci);
		System.out.println(p3.toString()+ "\nNome gerencia: " +  p3.nomeGerencia+ "\nValor Inss: " + p3.ValorInss(1212));
		System.out.println(p4.toString()+ "\nQuantidade vendas:" + p4.qtdVendas+ "\nValor vendas: "+ p4.valorVendas);


		
	}

}
