package userinterface;

import java.util.Scanner;

import model.QUESTAO;



public class PROVA {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		QUESTAO lista[];
		lista = new QUESTAO[5];
				
		int cont;
		int pontos=0;
		String resposta;
					
		
		lista[0] = new QUESTAO("Questao 1 ", "V");
		lista[1] = new QUESTAO("Questao 2 ", "F");
		lista[2] = new QUESTAO("Questao 3 ", "V");
		lista[3] = new QUESTAO("Questao 4 ", "F");
		lista[4] = new QUESTAO("Questao 5 ", "V");
		
		for (cont = 0; cont < lista.length; cont++) {
			System.out.println(lista[cont].exibirQuestao() );
			resposta = teclado.nextLine();
			if (lista[cont].corrigir(resposta)) {
				pontos++;				
			}
		System.out.println("Acertou");
		
		}

	
	}
			
		
	}


