package mainpkg;

public final class ObjArrays {
	private static Professor[] professores = new Professor[20];
	private static Disciplina[] disciplinas = new Disciplina[50];
	private static String[] discArrayNome = new String[50];
	private static Aluno[] alunos = new Aluno[100];
	private static int finalprof = 1;
	private static int finalalun = 1;
	private static int finaldisc = 1;
	
	private static int[] vetorCodigos = {0, 0, 0, 0, 0, 0, 0, 0};
	
	//Métodos auxiliares para cadastro de professores novos (finalprof)
	
	public static Professor getProfessor(int num) {
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
		int[] vetorplh = {0, 0, 0, 0, 0};
		for (int i = 0; i < 5; i++) vetorplh[i] = vetorCodigos[i];
		professores[finalprof].setdisciplinasMinistradas(vetorplh);
		for(int i = 0; i< 8; i++) vetorCodigos[i] = 0;
		finalprof++;
	}

	


	//Métodos auxiliares para cadastro de disciplinas(finaldisc)
	
	public static int getFinaldisc() {
		return finaldisc;
	}

	public static Disciplina getDisciplinas(int num) {
		return disciplinas[num];
	}

	public static int setDisciplinas(String nome, String modalidade) {
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
		criaArrayDisciplinas(finaldisc);
		finaldisc++;
		return finaldisc-1;
		
		}
		else {
			System.out.println(disciplinas[whichDisc].getCod()+"___"+disciplinas[whichDisc].getNome()+"__"+disciplinas[whichDisc].getModalidade());
			return whichDisc;
		}
	}
	
	public static void criaArrayDisciplinas(int num){
		discArrayNome[num] = disciplinas[num].getNome();
	}
	
	public static String[] getArrayDisciplinas(){
		String[] retornoNome = new String[finaldisc];
		int j = 1;
		retornoNome[0] = "";
		for(int i =1; i<finaldisc;i++){
			retornoNome[j] = discArrayNome[i];
			j++;
		}
		return retornoNome;
	}
	
	public static String getModalidade(String nome){
		for(int i = 1; i < finaldisc; i++){
			if(disciplinas[i].getNome().equals(Disciplina.limparString(nome))){
				return disciplinas[i].getModalidade();
			}
		}
		return null;
	}
	
	
	//Métodos auxiliares para cadastro de novos alunos
	
	public static void setDadosAlunos(String nome, String senha){
		alunos[finalalun].setNome(nome);
		alunos[finalalun].setSenha(senha);
		System.out.println(alunos[finalalun].getNome());
	}
	
	public static void criarAlunos(Aluno aluno) {
		alunos[finalalun] = new Aluno();
		alunos[finalalun] = aluno;
		alunos[finalalun].setMatricula(finalprof);
	}
	
	public static Aluno getAluno(int num){
		return alunos[num];
	}
	
	public static int getFinalAlun(){
		return finalalun;
	}
	
	public static String getAlunMatricula(int i){
		return alunos[i].getMatricula();
	}
	
	public static void adicionarAlunDisciplina(String discNome){
		int cont = 0;
		int cod = 0;
		for(int i = 1; i < finaldisc; i++){
			if(disciplinas[i].getNome().equals(Disciplina.limparString(discNome))){
				cod = disciplinas[i].getCod();
				while(cont < 8){
					if (vetorCodigos[cont] == 0){ 
						vetorCodigos[cont] = cod;
						break;
					}
					else cont++;
				}
				break;
			}
		}
	}
	
	public static void terminaAlunCadastro(){
		
		alunos[finalalun].setDisciplinasCursando(vetorCodigos);
		for(int i = 0; i< 8; i++) vetorCodigos[i] = 0;
		finalalun++;
	}

}