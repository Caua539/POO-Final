package mainpkg;

public final class ObjArrays {
	private static Professor[] professores = new Professor[20];
	private static Disciplina[] disciplinas = new Disciplina[50];
	private static int finalprof = 1;
	private static int finalalu = 1;
	private static int finaldisc = 1;
	
	private static int[] vetorCodigos = {0, 0, 0, 0, 0};
	
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
	}
	
	public static String getProfMatricula(int i){
		return professores[i].getMatricula();
	}
	
	public static void adicionarProfDisciplina(int num){
		int cont = 0;
		while(cont < 5){
			if (vetorCodigos[cont] == 0){ 
				vetorCodigos[cont] = num;
				break;
			}
			else cont++;
			
		}
		
	}
	
	public static void removeProfessores(){
		finalprof--;
	}
	
	public static void terminaProfCadastro(){
		professores[finalprof].setdisciplinasMinistradas(vetorCodigos);
		for(int i = 0; i< 5; i++) vetorCodigos[i] = 0;
		finalprof++;
	}

	


	//Métodos auxiliares para cadastro de disciplinas(finaldisc)
	
	public static int getFinaldisc() {
		return finaldisc;
	}

	public static Disciplina getDisciplinas(int num) {
		return disciplinas[num];
	}

	public static void setDisciplinas(String nome, String modalidade) {
		boolean newDisc = true;
		int whichDisc = 0;
		for(int i = 1; i < finaldisc; i++){
			if(disciplinas[i].getNome().equals(Disciplina.limparString(nome))){
				newDisc = false;
				whichDisc = i;
				break;
			}
		}
		if (newDisc) {
			disciplinas[finaldisc] = new Disciplina(finaldisc, nome, modalidade);
		System.out.println(disciplinas[finaldisc].getCod()+"___"+disciplinas[finaldisc].getNome()+"__"+disciplinas[finaldisc].getModalidade());
		adicionarProfDisciplina(finaldisc);
		finaldisc++;
		}
		else {
			System.out.println(disciplinas[whichDisc].getCod()+"___"+disciplinas[whichDisc].getNome()+"__"+disciplinas[whichDisc].getModalidade());
			adicionarProfDisciplina(whichDisc);
		}
	}

}