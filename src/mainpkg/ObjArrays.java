package mainpkg;

import java.util.ArrayList;

public class ObjArrays {
	//private static Professor[] professores = new Professor[20];
	private static ArrayList< Professor > professores = new ArrayList< Professor >(50);
	//private static Disciplina[] disciplinas = new Disciplina[50];
	private static ArrayList< Disciplina > disciplinas = new ArrayList< Disciplina >(50);
	//private static Aluno[] alunos = new Aluno[100];
	private static ArrayList< Aluno > alunos = new ArrayList< Aluno >(200);
	private static String[] discArrayNome = new String[50];
	private static int finalprof = 0;
	private static int finalalun = 0;
	private static int finaldisc = 0;
	
	private static int[] vetorCodigos = {0, 0, 0, 0, 0, 0, 0, 0};
	
	//MÉTODOS PARA ESCREVER E LER DADOS DO ARQUIVO
	public static ArrayList<Professor> getProfessores(){
		return professores;
	}
	
	public static void setProfessoresArray(ArrayList<Professor> professoresarray){
		professores = professoresarray;
	}
	
	public static ArrayList<Disciplina> getDisciplinas(){
		return disciplinas;
	}
	
	public static void setDisciplinasArray(ArrayList<Disciplina> disciplinasarray){
		disciplinas = disciplinasarray;
	}
	
	public static ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public static void setAlunosArray(ArrayList<Aluno> alunosarray){
		alunos = alunosarray;
	}
	
	public static void setFinalProf(int i){
		finalprof = i;
	}
	public static void setFinalDisc(int i){
		finaldisc = i;
	}
	public static void setFinalAlun(int i){
		finalalun = i;
	}
	
	public static String[] getDiscArray(){
		return discArrayNome;
	}
	public static void setDiscArray(String [] discArray){
		discArrayNome = discArray;
	}
	
	//Métodos auxiliares para cadastro de professores novos (finalprof)
	
	public static Professor getProfessor(int num) {
		return professores.get(num);
	}
	
	public static int getFinalProf(){
		return finalprof;
	}

	public static void criarProfessores(Professor professor) {
		//professores[finalprof] = new Professor();
		//professores[finalprof] = professor;
		professores.add(professor);
		professores.get(finalprof).setMatricula(finalprof);
	}
	
	public static void setDadosProfessores(String nome, String senha){
		professores.get(finalprof).setNome(nome);
		professores.get(finalprof).setSenha(senha);
		System.out.println(professores.get(finalprof).getNome());
	}
	
	public static String getProfMatricula(int i){
		return professores.get(i).getMatricula();
	}
	
	public static void adicionarProfDisciplina(int num){
		disciplinas.get(num-1).addProfessor(professores.get(finalprof).getMatricula());
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
		professores.get(finalprof).setdisciplinasMinistradas(vetorplh);
		for(int i = 0; i< 8; i++) vetorCodigos[i] = 0;
		finalprof++;
	}

	


	//Métodos auxiliares para cadastro de disciplinas(finaldisc)
	
	public static int getFinaldisc() {
		return finaldisc;
	}

	public static Disciplina getDisciplinas(int num) {
		return disciplinas.get(num);
	}

	public static int setDisciplinas(String nome, String modalidade) {
		boolean newDisc = true;
		int whichDisc = 0;
		for(int i = 0; i < finaldisc; i++){
			if(disciplinas.get(i).getNome().equals(Disciplina.limparString(nome))){
				newDisc = false;
				whichDisc = i;
				break;
			}
		}
		if (newDisc) {
			Disciplina nova = new Disciplina(finaldisc+1, nome, modalidade);
			System.out.println("finaldisc = "+finaldisc);
			disciplinas.add(nova);
		System.out.println(disciplinas.get(finaldisc).getCod()+"___"+disciplinas.get(finaldisc).getNome()+"__"+disciplinas.get(finaldisc).getModalidade());
		criaArrayDisciplinas(finaldisc);
		finaldisc++;
		return finaldisc;
		
		}
		else {
			System.out.println(disciplinas.get(whichDisc).getCod()+"___"+disciplinas.get(whichDisc).getNome()+"__"+disciplinas.get(whichDisc).getModalidade());
			return whichDisc;
		}
	}
	
	public static void criaArrayDisciplinas(int num){
		discArrayNome[num] = disciplinas.get(num).getNome();
	}
	
	public static String[] getArrayDisciplinas(){
		String[] retornoNome = new String[finaldisc];
		int j = 0;
		for(int i = 0; i<finaldisc;i++){
			retornoNome[j] = discArrayNome[i];
			j++;
		}
		return retornoNome;
	}
	
	public static String getModalidade(String nome){
		for(int i = 0; i < finaldisc; i++){
			if(disciplinas.get(i).getNome().equals(Disciplina.limparString(nome))){
				return disciplinas.get(i).getModalidade();
			}
		}
		return null;
	}
	
	
	//Métodos auxiliares para cadastro de novos alunos
	
	public static void setDadosAlunos(String nome, String senha){
		alunos.get(finalalun).setNome(nome);
		alunos.get(finalalun).setSenha(senha);
		System.out.println(alunos.get(finalalun).getNome());
	}
	
	public static void criarAlunos(Aluno aluno) {
		//alunos[finalalun] = new Aluno();
		alunos.add(aluno);
		alunos.get(finalalun).setMatricula(finalalun);
	}
	
	public static Aluno getAluno(int num){
		return alunos.get(num);
	}
	
	public static int getFinalAlun(){
		return finalalun;
	}
	
	public static String getAlunMatricula(int i){
		return alunos.get(i).getMatricula();
	}
	
	public static void adicionarAlunDisciplina(String discNome){
		int cont = 0;
		int cod = 0;
		for(int i = 0; i < finaldisc; i++){
			if(disciplinas.get(i).getNome().equals(Disciplina.limparString(discNome))){
				cod = disciplinas.get(i).getCod();
				disciplinas.get(i).addAluno(alunos.get(finalalun).getMatricula());
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
		
		alunos.get(finalalun).setDisciplinasCursando(vetorCodigos);
		for(int i = 0; i< 8; i++) vetorCodigos[i] = 0;
		finalalun++;
	}
	
	
	//MÉTODOS AUXILIARES PARA BUSCA NOS ARRAYS DE OBJETOS(PROFESSOR, DISCIPLINA, ALUNO)
	
	public static Professor buscaProfessor(String matricula){
		for(int i = 0; i < finalprof; i++){
			if(professores.get(i).getMatricula().equals(matricula)){
				System.out.println(professores.get(i).getMatricula());
				return professores.get(i);
			}
		}
		return null;
	}
	
	public static Aluno buscaAluno(String matricula){
		for (int i = 0; i < finalalun; i++){
			if (alunos.get(i).getMatricula().equals(matricula)){
			return alunos.get(i);
			}
		}
		return null;
	}
	
	public static Disciplina buscaDisciplina(int cod){
		for(int i = 0; i < finaldisc; i++){
			if(disciplinas.get(i).getCod() == cod){
				return disciplinas.get(i);
			}
		}
		return null;
	}
	public static Disciplina buscaDisciplinaByNome(String nome){
		for(int i = 0; i < finaldisc; i++){
			if(disciplinas.get(i).getNome().equals(Disciplina.limparString(nome))){
				return disciplinas.get(i);
			}
		}
		return null;
	}

}