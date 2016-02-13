package mainpkg;

public final class ObjArrays {
	private static Professor[] professores = new Professor[20];
	private static int finalprof = 1;
	private static int finalalu = 1;
	
	//Métodos auxiliares para cadastro de professores novos (finalprof)
	
	public static Professor getProfessores(int num) {
		return professores[num];
	}
	
	public static int getFinalProf(){
		return finalprof;
	}

	public static void criarProfessores(Professor professor) {
		professores[finalprof] = new Professor();
		professores[finalprof] = professor;
		professores[finalprof].setMatricula(finalprof);
	}
	
	public static void setDadosProfessores(String nome, String senha){
		professores[finalprof].setNome(nome);
		professores[finalprof].setSenha(senha);
		System.out.println(professores[finalprof].getNome());
		finalprof++;
	}
	
	public static String getFormattedMatricula(int i){
		return professores[i].getMatricula();
	}
	
	public static void removeProfessores(){
		finalprof--;
	}
	
}
