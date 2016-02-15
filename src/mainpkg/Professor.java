package mainpkg;

public class Professor extends Cadastrado {
	
	private int disciplinasMinistradas[] = {0, 0, 0, 0, 0};

	
	public void setMatricula(int matricula){
		String formatted = String.format("%03d", matricula+1);
		this.matricula = "2016-"+formatted;
		System.out.println(this.matricula);
	}

	public String[] getDisciplinasMinistradas(){
		System.out.println("passei");
		int tamString = 0;
		for (int i = 0; i<5; i++){
			if (disciplinasMinistradas[i] != 0){
				System.out.println("entrei1");
				tamString++;
			}
		}
		System.out.println("passei 2");
		String[] discNomes = new String[tamString];
		for(int i=0; i < tamString; i++){
			System.out.println("entrei");
			if(ObjArrays.buscaDisciplina(disciplinasMinistradas[i])!= null){
				System.out.println(disciplinasMinistradas[i]+"meeeh ");
				discNomes[i] = ObjArrays.buscaDisciplina(disciplinasMinistradas[i]).getNome();
				System.out.println(discNomes[i]);
			}
		}
		return discNomes;
	}
	
	public int getSingleDisciplinaMinistrada(int index){
		return disciplinasMinistradas[index];
	}

	public void setdisciplinasMinistradas(int disciplinasMinistradas[]) {
		this.disciplinasMinistradas = disciplinasMinistradas;
		for(int i = 0; i<5; i++){
			System.out.println(this.disciplinasMinistradas[i]+" why");
		}
	}
	
	
}
