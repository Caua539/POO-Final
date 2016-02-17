package mainpkg;

import java.text.DecimalFormat;

public class Aluno extends Cadastrado {
	
	//private int[] disciplinasCursando = {0, 0, 0, 0, 0, 0, 0, 0};
	private double[][] disciplinasENotas = new double[8][5]; //3 primeiras colunas são n1, n2, n3 e a última coluna é a media. Cada linha, uma disciplina;
	private boolean[][] flagFirstTime = new boolean[8][3]; //Flag para saber se o aluno j� teve as notas alteradas antes
	
	
	public Aluno(){
		for(int i=0; i < 8; i++){
			for(int j=0; j < 5; j++){
				disciplinasENotas[i][j] = 0.0;
			}
			for(int h=0; h< 3; h++){
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
	
	public double doMedia(double a, double b, double c){
		double d, e, f, total;
		d = a*0.3;
		e = b*0.3;
		f = c*0.4;
		total = d+e+f;
		return total;
	}

	public void setNotas(double a, double b, double c, int d){
		this.disciplinasENotas[d][1] = a;
		this.disciplinasENotas[d][2] = b;
		this.disciplinasENotas[d][3] = c;
		this.disciplinasENotas[d][4] = doMedia(disciplinasENotas[d][1], disciplinasENotas[d][2], disciplinasENotas[d][3]);
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
	public double getMedia(int d){
		return this.disciplinasENotas[d][4];
	}
	
	public String[] getDisciplinasCursando(){
		int[] disciplinasCursando = new int[8];
		for(int i=0; i < 8; i++){
			disciplinasCursando[i] = (int) disciplinasENotas[i][0];
		}
		int tamString = 0;
		for (int i = 0; i<8; i++){
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
	
	public int getSingleDisciplinaCursando(int i){
		return (int)disciplinasENotas[i][0];
	}
	
	public int[] getDisciplinasIntArray(){
		int[] disciplinasCursando = new int[8];
		for(int i=0; i < 8; i++){
			disciplinasCursando[i] = (int) disciplinasENotas[i][0];
		}
		return disciplinasCursando;
	}


	public void setDisciplinasCursando(int disciplinasCursando[]) {
		for(int i = 0; i < 8; i++){
			disciplinasENotas[i][0] = (double) disciplinasCursando[i];
		}
		for(int i = 0; i<8; i++){
			System.out.println(disciplinasENotas[i][0]);
		}
	}
}
