
public class Acervo {
	public static void main(String args[]) {
		Livros l1, l2;
		
		l1 = new Livros();
		l2 = new Livros();
		
		l1.setTitulo("jose");
		l1.setAutor("paulo");
		l1.setAnoPub(2019);
		l1.setCategoria("aventura");
		l1.setEstante(2);
		l1.setPrateleira(4);
		l1.setEmprestimo(true);
		
		
				
		l2.setTitulo("Eu");
		l2.setAutor("Maria");
		l2.setAnoPub(2018);
		l2.setCategoria("Drama");
		l2.setEstante(4);
		l2.setPrateleira(2);
		l2.setEmprestimo(false);
		
		System.out.println("Livros Biblioteca");
					
		l1.exibirInfo();
		l2.exibirInfo();
		
		
		
	}

}
