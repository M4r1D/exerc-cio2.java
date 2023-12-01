package exercicio_2;

public class Empregado extends Pessoa {
	String matricula;
	double salario;
	
	public Empregado() {
		
	}
    public Empregado(String matricula) {
		this.matricula=matricula;
	}
    public Empregado(String matricula, double salario) {
		this.matricula=matricula;
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double ValorInss(double ValorInss) {
		return salario*11;
	}
}
