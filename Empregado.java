package exercicio_2;

public class Empregado extends Pessoa{
	int codigoSetor;
	int salario;
	int imposto;
	
	public Empregado() {
		
	}
	public Empregado(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
    public Empregado(int codigoSetor, int salario) {
    	this.codigoSetor = codigoSetor;
		this.salario = salario;
	}
    public Empregado(int codigoSetor, int salario, int imposto) {
    	this.codigoSetor = codigoSetor;
		this.salario = salario;
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		return salario-imposto;
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	
}
