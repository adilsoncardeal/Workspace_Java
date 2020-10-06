
public class Folha {
	public static void main(String[] args) {
		Empregado e1, e2;
		
		e1= new Empregado();
		e2= new Empregado();
		
		e1.setNome("Jose");
		e1.setCargo("Analista");		
		e1.setSalario(1000.0);
		
		e2.setNome("Paulo");
		e2.setCargo("Diretor");		
		e2.setSalario(2000.0);
		
		e1.exibirInfo();
		e2.exibirInfo();
		
		e1.aumentarSalario(10);
		e2.aumentarSalario(5);
		
		System.out.println(".....novas informações....");
		e1.exibirInfo();
		e2.exibirInfo();
		
		
	}
	

}
