package model;

public class CartaoPrePago extends Object {
	protected String nomeTitular;
	protected String numeroCartao;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
			
	public CartaoPrePago(String nomeTitular, String numeroCartao, int anoValidade, int mesValidade, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else
			return false;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "Cart�o Pr� Pago:" +numeroCartao+ "/"+nomeTitular+"(mesValidade/anoValidade)";
		
	}
	

}
