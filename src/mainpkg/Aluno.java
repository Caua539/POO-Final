package mainpkg;

public class Aluno extends Cadastrado {
	
	private int[] disciplinasCursando = {0, 0, 0, 0, 0, 0, 0, 0};

	
	public void setMatricula(int matricula){
		matricula = matricula + 10000;
		String formatted = String.format("%05d", matricula);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}


	public int[] getDisciplinasCursando() {
		return disciplinasCursando;
	}


	public void setDisciplinasCursando(int disciplinasCursando[]) {
		this.disciplinasCursando = disciplinasCursando;
		for(int i = 0; i<8; i++){
			System.out.println(this.disciplinasCursando[i]);
		}
	}
}
