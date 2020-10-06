
/**
 * @author 002605715
 *
 */
public class Empregado {
	
	private String nome;
	private String cargo;
	private double salario;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	void exibirInfo() {
		System.out.println("Nome: "+nome+ "/"+cargo+" R$ "+salario);
			
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
				
	}

}

