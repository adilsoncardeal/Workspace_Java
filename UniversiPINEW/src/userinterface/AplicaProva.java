package userinterface;

import java.util.Scanner;

import model.QuestaoSimples;
import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;


public class AplicaProva {
	public static void main(String[] args) {
		String resp;
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples lista[];
		lista = new QuestaoSimples[5];
		
		lista[0] = new QuestaoSimples("E o XV? ","Jogou como nunca, perdeu como sempre!");
		lista[1] = new QuestaoComDica("Qual a linguagem do curso?", "JAVA","Come�a com JA e termina com VA");
		lista[2] = new QuestaoMultiplaEscolha("Qual a formula da �gua?", "H2O", "NaCl", "H2O", "H2SO4", "H2O2");
		lista[3] = new QuestaoComDica("Qual a cor do cavalo Branco de Napole�o?","Marrom","Cuidado com o nome");
		lista[4] = new QuestaoSimples("Quanto vale 1+1?","2");
		/*
		 * m�todo mais longo e mais complexo: a cada objeto recuperado tenho que verificar o tipo de 
		 * objeto instanciado e fazer um tratamento diferente para cada um
		 */
		for (QuestaoSimples q : lista) {
		   if (q instanceof QuestaoComDica) {
				QuestaoComDica qd = (QuestaoComDica)q;
				System.out.println(qd.getEnunciado());
				System.out.println("  DICA:"+qd.getDica());
			}
			else if (q instanceof QuestaoMultiplaEscolha) {
				QuestaoMultiplaEscolha qm = (QuestaoMultiplaEscolha)q;
				System.out.println(qm.getEnunciado());
				System.out.println("a. "+qm.getAlt1());
				System.out.println("b. "+qm.getAlt2());
				System.out.println("c. "+qm.getAlt3());
				System.out.println("d. "+qm.getAlt4());
			}
			else if (q instanceof QuestaoSimples) {  // o objeto q � do tipo "QuestaoSimples?"
				System.out.println(q.getEnunciado());
			}
		   
		   resp = teclado.nextLine();
		   if (q.corrigir(resp)) {
			   System.out.println("2 palavras: para bens");
		   }
		   else {
			   System.out.println("Erroooouuuuuuu");
		   }
		}
		
		/* este 2o m�todo usando polimorfismo facilita a abstra��o, pois o conceito comum "aplicar quest�o" tem
		 * diferentes formas de ser implementado, de acordo com o tipo de objeto (o tipo de quest�o instanciado)
		 * 
		 * neste caso como pensar? pensamos assim: o conceito � o mesmo? SIM, ent�o ele se torna um m�todo na
		 * superclasse e as demais classes filhas reescrevem a l�gica deste m�todo, aproveitando alguma
		 * informa��o da superclasse e incluindo informa��es espec�ficas da sua pr�pria defini��o
		 */
		
//		for (QuestaoSimples q: lista) {
//			System.out.println(q.aplicarQuestao());
//			resp = teclado.nextLine();
//			if (q.corrigir(resp)) {
//				System.out.println("Parab�ns");
//			}
//			else {
//				System.out.println("Errou!");
//			}
//		}
		
		teclado.close();
	}

}