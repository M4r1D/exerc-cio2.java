package exercicio_2;

public class Peixe extends Animal{
	String tipoHabitat;
	
	//construtor
	 public Peixe() {
		 
	 }
	 public Peixe(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	 }
	 
	 //get 
	 public String GettipoHabitat() {
		 return tipoHabitat;
	 }
	 
	 //set
	 public void SettipoHabitat(String tipoHabitat) {
		 this.tipoHabitat = tipoHabitat;
	 }
	 
	 
}
