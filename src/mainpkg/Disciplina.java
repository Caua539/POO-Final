package mainpkg;

import java.util.*;
import java.io.Serializable;
import java.text.*;


public class Disciplina implements Serializable {

	private String nome;
	private String modalidade;
	private int cod;
	private boolean hasProf = false;
	private boolean hasAluno = false;
	private int contadorAlunos = 0;
	private int contadorProfs = 0;
	private String[] alunosCod = new String[100];
	private String[] professoresCod = new String[3];
	
	
	public Disciplina(int cod, String nome, String modalidade){
		this.cod = cod;
		this.setNome(nome);
		this.setModalidade(modalidade);
		for (int i = 0; i < 3; i++) professoresCod[i] = null;
		for (int i = 0; i < 100; i++) alunosCod[i] = null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = limparString(nome);
	}
	
	public static String limparString(String nome)     {
        nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
        nome = nome.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return nome.toUpperCase();
    }
	
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = limparString(modalidade);
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String[] getAlunoCod(){
		int tamString = 0;
		for (int i = 0; i<ObjArrays.getFinalAlun(); i++){
			if (alunosCod[i] != null){
				tamString++;
			}
		}
		String[] plhString = new String[tamString];
		for(int i=0; i< tamString; i++){
			plhString[i] = alunosCod[i]+"       "+ObjArrays.buscaAluno(alunosCod[i]).getNome();
			System.out.println(plhString[i]);
		}
		
		return plhString;
	}
	
	public void addProfessor(String matricula){
		this.professoresCod[contadorProfs] = matricula;
		this.contadorProfs++;
		this.hasProf = true;
	}
	
	public boolean checaSlotProf(){
		for(int i=0; i < 3; i++){
			if (professoresCod[i] == null){
				return true;
			}
		}
		return false;
	}
	
	public void addAluno(String matricula){
		this.alunosCod[contadorAlunos] = matricula;
		this.contadorAlunos++;
		this.hasAluno = true;
	}
	
	public void removeProfessor(String matricula){
		for(int i = 0; i < this.contadorProfs; i++){
			if(this.professoresCod[i].equals(matricula)){
				this.professoresCod[i] = null;
				this.contadorProfs--;
				break;
			}
		}
		if (contadorProfs < 0) contadorProfs = 0;
		if (contadorProfs == 0) this.hasProf = false;
	}
	
	public void removeAluno(String matricula){
		for(int i = 0; i < this.contadorAlunos; i++){
			if(this.alunosCod[i].equals(matricula)){
				this.alunosCod[i] = null;
				this.contadorAlunos--;
				break;
			}
		}
		if (contadorAlunos < 0) contadorAlunos = 0;
		if (contadorAlunos == 0) this.hasAluno = false;
	}
	
	
	
}
