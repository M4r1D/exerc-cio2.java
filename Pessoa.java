package exercicio_2;

public class Pessoa {
	String nome;
	int idade;
	String sexo;
	
	public Pessoa() {
		
	}
    public Pessoa(String nome) {
		this.nome = nome;
	}
    public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
    public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	
}
