package userinterface;

import model.CartaoPrePago;

import java.util.ArrayList;

import model.CartaoCashBack;


public class AplicacaoPrincipal {
	public static void main(String args[]){
		
		/*
		CartaoPrePago cartoes[];  // defino um vetor de cartões (Array)
		
		cartoes = new CartaoPrePago[4]; // defino o tamanho do meu array
		
		cartoes[0] = new CartaoPrePago("Isidro","111.111.111.111",2030, 10, 1000.0);
		cartoes[1] = new CartaoCashBack("Nicolas","222.222.222.222",2030, 10, 1000.0, 0);
		cartoes[2] = new CartaoCashBack("Paulo","333.333.333.333",2030, 10, 1000.0, 1);
		cartoes[3] = new CartaoCashBack("Pipoca","444.444.4444.444",2030, 10, 1000.0, 2);
		*/
		
		ArrayList<CartaoPrePago> lista;
		lista = new ArrayList<CartaoPrePago>();
		lista.add(new CartaoPrePago("Isidro",  "111.111.111.111", 2030, 10, 1000.0));
		lista.add(new CartaoCashBack("Nicolas","222.222.222.222", 2030, 10, 1000.0, 0));
		lista.add(new CartaoCashBack("Paulo",  "333.333.333.333", 2030, 10, 1000.0, 1));
		lista.add(new CartaoCashBack("Pipoca", "444.444.4444.444",2030, 10, 1000.0, 2));
			
		/*
		for (int pos=0; pos<cartoes.length; pos++) {
			System.out.println(cartoes[pos]);
			
		}
		*/
		
		System.out.println("\n -- comprando R$ 100,00 em cada um\n");
		
		//for (int i=0; i<lista.size(); i++) {
		for (CartaoPrePago q:lista) {
		//	CartaoPrePago q =lista.get(i);
			q.comprar(100.0);
			System.out.println(q);
			
		}
		/*		
		System.out.println("\n -- comprando R$ 100,00 em cada um\n");
		*/
		/*
		for (CartaoPrePago c: cartoes) {
			c.comprar(100.0);
			System.out.println(c);
		}
		*/
		
			System.out.println("Compra no cartao pre pago autorizado");
		}
				
	

}
