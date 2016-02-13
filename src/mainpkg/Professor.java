package mainpkg;

public class Professor extends Cadastrado {

	public String getMatricula(){
		String formatted = String.format("%03d", this.matricula);
		return formatted;
	}
	
	
}
