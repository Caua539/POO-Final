package mainpkg;

public class Professor extends Cadastrado {
	
	private int disciplinasMinistradas[] = {0, 0, 0, 0, 0};

	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(int matricula){
		String formatted = String.format("%03d", matricula);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}

	public int[] getdisciplinasMinistradas() {
		return disciplinasMinistradas;
	}

	public void setdisciplinasMinistradas(int disciplinasMinistradas[]) {
		this.disciplinasMinistradas = disciplinasMinistradas;
		for(int i = 0; i<5; i++){
			System.out.println(this.disciplinasMinistradas[i]);
		}
	}
	
	
}
