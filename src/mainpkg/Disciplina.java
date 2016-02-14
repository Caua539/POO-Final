package mainpkg;

import java.util.*;
import java.text.*;


public class Disciplina {

	private String nome;
	private String modalidade;
	private int cod;
	private boolean hasProf = false;
	private int contadorProfs = 0;
	private String[] professoresCod = {null, null, null, null, null, null, null};
	
	
	public Disciplina(int cod, String nome, String modalidade){
		this.cod = cod;
		this.setNome(nome);
		this.setModalidade(modalidade);
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
	
	public void addProfessor(String matricula){
		this.professoresCod[contadorProfs] = matricula;
		this.contadorProfs++;
		this.hasProf = true;
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
	
}
