package mainpkg;

import java.text.DecimalFormat;

public class Aluno extends Cadastrado {
	
	private int size = ObjArrays.getFinaldisc();
	private double[][] disciplinasENotas = new double[size][5]; //3 primeiras colunas são n1, n2, n3 e a última coluna é a media. Cada linha, uma disciplina;
	private boolean[][] flagFirstTime = new boolean[size][4]; //Flag para saber se o aluno j� teve as notas alteradas antes
	
	
	public Aluno(){
		
		
		for(int i=0; i < size; i++){
			for(int j=0; j < 5; j++){
				disciplinasENotas[i][j] = 0.0;
			}
			for(int h=0; h< 4; h++){
				flagFirstTime[i][h] = false;
			}
		}
	}
	
	
	public boolean getFlag(int d, int i){
		return this.flagFirstTime[d][i];
	}
	public void setFlag(boolean flag, int d, int i){
		this.flagFirstTime[d][i] = flag;
	}

	
	public void setMatricula(int matricula){
		matricula = matricula + 10001;
		String formatted = String.format("%05d", matricula);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}
	
	public double doMedia(double a, double b, double c, double x){
		double d, e, f, g, total;
		d = a*0.2;
		e = b*0.2;
		f = c*0.2;
		g = x*0.4;
		
		total = d+e+f+g;
		return total;
	}

	public void setNotas(double a, double b, double c, double d, int disc){
		this.disciplinasENotas[disc][1] = a;
		this.disciplinasENotas[disc][2] = b;
		this.disciplinasENotas[disc][3] = c;
		this.disciplinasENotas[disc][4] = d;
		this.disciplinasENotas[disc][0] = doMedia(disciplinasENotas[disc][1], disciplinasENotas[disc][2], disciplinasENotas[disc][3], disciplinasENotas[disc][4]);
	}
	
	public double getN1(int d){
		return this.disciplinasENotas[d][1];
	}
	public double getN2(int d){
		return this.disciplinasENotas[d][2];
	}
	public double getN3(int d){
		return this.disciplinasENotas[d][3];
	}
	public double getN4(int d){
		return this.disciplinasENotas[d][4];
	}
	public double getMedia(int d){
		return this.disciplinasENotas[d][0];
	}
	
	/*public String[] getDisciplinasCursando(){
		String[] discNomes = new String[size];
		for(int i=0; i < size; i++){
			if(ObjArrays.buscaDisciplina(disciplinasCursando[i])!= null){
				discNomes[i] = ObjArrays.buscaDisciplina(disciplinasCursando[i]).getNome();
				System.out.println(discNomes[i]);
			}
		}
		return discNomes;
	}
	
	public int getSingleDisciplinaCursando(int i){
		return disciplinasCursando[i];
	}
	
	public int[] getDisciplinasIntArray(){
		int[] disciplinasCursando = new int[8];
		for(int i=0; i < 8; i++){
			disciplinasCursando[i] = (int) disciplinasENotas[i][0];
		}
		return disciplinasCursando;
	}


	public void setDisciplinasCursando(int disciplina, int i) {
		this.disciplinasCursando[i] = disciplina;
	}*/
}
