
public class Time {

	private int h;
	private int m;
	private int s;
	
	public void setTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public String exibirHoraUniversal() {
		String res;
		res = formataNumero(h) + ":" + formataNumero(m) + ":" +formataNumero(s);
		return res;
	}
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0" + num;
		}
		else {
			return String.valueOf(num);
		}
		
	//public String exibirHoraPadrao() {
		//int novaHora;
		//String sufixo;
		//if (this.h == 0) {
			//novaHora = 12;
			//sufixo = "AM";
	
		
		
	}
			
	
}

