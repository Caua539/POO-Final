package mainpkg;

public class Aluno extends Cadastrado {
	
	private int[] disciplinasCursando = {0, 0, 0, 0, 0, 0, 0, 0};
	private double n1 = 0, n2=0, n3=0, media =0;
	private boolean[] flagFirstTime = {false, false, false}; //Flag para saber se o aluno j� teve as notas alteradas antes
	
	public boolean getFlag(int i){
		return this.flagFirstTime[i];
	}
	public void setFlag(boolean flag, int i){
		this.flagFirstTime[i] = flag;
	}

	
	public void setMatricula(int matricula){
		matricula = matricula + 10001;
		String formatted = String.format("%05d", matricula);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}
	
	public double doMedia(double a, double b, double c){
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
		this.media = doMedia(n1, n2, n3);
	}
	
	public double getN1(){
		return this.n1;
	}
	public double getN2(){
		return this.n2;
	}
	public double getN3(){
		return this.n3;
	}
	public double getMedia(){
		return this.media;
	}
	
	public String[] getDisciplinasCursando(){
		int tamString = 0;
		for (int i = 0; i<5; i++){
			if (disciplinasCursando[i] != 0){
				tamString++;
			}
		}
		String[] discNomes = new String[tamString];
		for(int i=0; i < tamString; i++){
			if(ObjArrays.buscaDisciplina(disciplinasCursando[i])!= null){
				discNomes[i] = ObjArrays.buscaDisciplina(disciplinasCursando[i]).getNome();
				System.out.println(discNomes[i]);
			}
		}
		return discNomes;
	}


	public void setDisciplinasCursando(int disciplinasCursando[]) {
		this.disciplinasCursando = disciplinasCursando;
		for(int i = 0; i<8; i++){
			System.out.println(this.disciplinasCursando[i]);
		}
	}
}
