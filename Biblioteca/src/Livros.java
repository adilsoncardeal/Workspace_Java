
public class Livros {

	private String titulo;
	private String autor;
	private int anoPub;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestimo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPub() {
		return anoPub;
	}
	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	

	
	public void exibirInfo() {
		System.out.println("Titulo: "+titulo +  " Autor:"+autor +  " Ano Publ: "+anoPub);
		System.out.println("Categoria: "+categoria + " Estante: "+estante + " Prateleira: "+prateleira + " Emprestimo: "+emprestimo);	
	}
	
	
	
	
}
