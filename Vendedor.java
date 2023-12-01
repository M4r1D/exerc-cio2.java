package exercicio_2;

public class Vendedor extends Empregado{
	double valorVendas;
	int qtdVendas;
	
	public Vendedor() {
		
	}
    public Vendedor(double valorVendas) {
		this.valorVendas = valorVendas;
	}
    public Vendedor(double valorVendas, int qtdVendas) {
		this.valorVendas = valorVendas;
		this.qtdVendas = qtdVendas;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQtdVendas() {
		return qtdVendas;
	}
	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
}
