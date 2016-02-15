package mainpkg;

public class Aluno extends Cadastrado {
	
	private int[] disciplinasCursando = {0, 0, 0, 0, 0, 0, 0, 0};
	private double n1 = 0, n2=0, n3=0, media =0;

	
	public void setMatricula(int matricula){
		matricula = matricula + 10001;
		String formatted = String.format("%05d", matricula);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}
	
	public double getMedia(double a, double b, double c){
		double d, e, f, total;
		d = a*0.3;
		e = b*0.3;
		f = c*0.4;
		total = d+e+f;
		return total;
	}

	public void setNotas(double a, double b, double c){
		this.n1 = a;
		this.n2 = b;
		this.n3 = c;
		this.media = getMedia(n1, n2, n3);
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
