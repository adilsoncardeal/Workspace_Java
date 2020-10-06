package userinterface;

import java.util.ArrayList;

import core.Funcionario;
import core.Chefe;
import core.Comissionado;
import core.Horista;
import core.Empreiteiro;

public class Pagamento {
	
	public static void main(String[]args) {
		
	/*	Funcionario co1, c1, h1, e1;
		
		co1 = new Comissionado(111, "Paulo", 1000,10); 
		System.out.println(co1.calcularSalario());
		System.out.println(co1.getNome());
		
		c1 = new Chefe(222, "João", 2000,10,200); 
		System.out.println(c1.calcularSalario());
		System.out.println(c1.getNome());
		
		
		h1 = new Horista(333, "José", 15,150); 
		System.out.println(h1.calcularSalario());
		System.out.println(h1.getNome());
		
		e1 = new Empreiteiro(444, "Manoel",950);
		System.out.println(e1.calcularSalario());
		System.out.println(e1.getNome());
		
	}
	*/
		
	ArrayList<Funcionario> lista;
	lista = new ArrayList<Funcionario>();
	
	lista.add(new Chefe(1111, "Paulo Chefe", 3000.0f, 10.0f, 350.0f));
	lista.add(new Comissionado(2222,"Jose Comissionado", 1500.0f, 10.0f));
	lista.add(new Horista(3333, "Maria Horista", 13.5f, 80));
	lista.add(new Horista(4444, "João Horista", 13.5f, 90));
	lista.add(new Empreiteiro(5555, "João Autonomo", 1350.0f));
	
	System.out.println("Folha de Pagamento");
	for (Funcionario f: lista) {
		System.out.printf("  %-30s  %s\n",f.getNome(), f.calcularSalario());
	}
	
	
	}

}
