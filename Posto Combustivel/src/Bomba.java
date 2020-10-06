
public class Bomba {
	private String nome;
	private double Valorlitro;
	private double totallitros;
	private double totalPagar;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorlitro() {
		return Valorlitro;
	}
	public void setValorlitro(double valorlitro) {
		Valorlitro = valorlitro;
	}
	public double getTotallitros() {
		return totallitros;
	}
	public void setTotallitro(double totallitros) {
		this.totallitros = totallitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	public void abastecerPorLitros(double litros) {
		this.totallitros = litros;
		this.totalPagar = litros * Valorlitro;
	}
	public void abastecerPorValor(double total) {
		this.totalPagar = total;
		this.totallitros = total / Valorlitro;
	}
	
	
}
