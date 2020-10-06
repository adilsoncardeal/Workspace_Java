package model;

public class QUESTAO {
	
	private String enunciado;
	private String gabarito;
	
	
	public QUESTAO(String enunciado, String gabarito) {
		super();
		this.enunciado = enunciado;
		this.gabarito = gabarito;
	}
	
	public String exibirQuestao() {
		return enunciado;
	}
	
	public boolean corrigir(String respostaUsuario) {
		return this.gabarito.contentEquals(respostaUsuario);
		
		//if(gabarito.equals (respostaUsuario)){
		//	return true;
	//	}
		//else {
		//	return false;
		}
	}
	

	

	

	
	


