package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo; //0 - GOLD / 1 - SILVER / 2 - BORNZE

	public CartaoCashBack(String nomeTitular, String numeroCartao, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(nomeTitular, numeroCartao, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch(tipo) {
			case 0:
				super.saldo +=valor *0.08;
				break;
			case 1:
				super.saldo +=valor *0.05;
				break;
			case 2:
				super.saldo +=valor *0.02;
				break;
			}
			return true;
		}
		return false;
		
	}
		public String toString() {
			String strTipo;
			if(tipo==0) {
				strTipo = "GOLD";
			}
			else if(tipo==1) {
				strTipo = "SILVER";
			}
			else {
				strTipo = "BRONZE";
			}
			return "Cartao Cash Back "+super.numeroCartao+"/"+super.nomeTitular+
					   " ("+super.mesValidade+"/"+super.anoValidade+")  R$ "+super.saldo+" "+strTipo;
					
		}
		
		

}
