package exercicio_2;

public class Gerente extends Empregado{
	String nomeGerencia;
	
	public Gerente() {
		
	}
    public Gerente(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	public String getNomeGerente() {
		return nomeGerencia;
	}
	public void setNomeGerente(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
    
}
