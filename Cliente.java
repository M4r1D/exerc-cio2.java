package exercicio_2;

public class Cliente extends Pessoa {
	double valorDivida;
	int anoNasci;
	
	public Cliente() {
		
	}
    public Cliente(double valorDivida) {
		this.valorDivida = valorDivida;
	}
    public Cliente(double valorDivida, int anoNasci) {
		this.valorDivida = valorDivida;
		this.anoNasci = anoNasci;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getAnoNasci() {
		return anoNasci;
	}
	public void setAnoNasci(int anoNasci) {
		this.anoNasci = anoNasci;
	}
    
    

}
