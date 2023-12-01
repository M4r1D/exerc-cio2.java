package exercicio_2;

public class Animal {
		String nome;
		double peso;
	
	// construtores
	public Animal() {
		
	}
	public Animal(String nome) {
		this.nome = nome;
	}
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	//get
	public String Getnome() {
		return nome;
	}
	public double Getpeso() {
		return peso;
	}
	//set
	public void Setnome(String nome) {
		this.nome = nome;
	}
	public void Setpeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + "]";
	}
	
	
}