package exercicio_2;

public class Cachorro extends Animal {
	String raca;
	
	public Cachorro() {
		
	}
	public Cachorro(String raca) {
		this.raca = raca;
	}
	//get
	public String Getraca() {
		return raca;
	}
	//set
	public void Setraca(String raca) {
		this.raca = raca;
	}
	
	
}
