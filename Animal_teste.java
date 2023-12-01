package exercicio_2;

public class Animal_teste {
	public static void main(String[] args) {
		Cachorro a1 = new Cachorro();
		Peixe a2 = new Peixe();
		
		a1.nome = "snoopy";
		a2.nome = "charmander";
		
		a1.peso = 23.00;
		a2.peso = 5.02;
		
		a1.raca = "jack russell";
		a2.tipoHabitat = "água doce";
		
		System.out.println(a1.toString() + a1.raca);
		System.out.println(a2.toString() + a2.tipoHabitat);

		
		
	}
}
