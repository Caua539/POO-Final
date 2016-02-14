package mainpkg;

import java.util.*;
import java.text.*;


public class Disciplina {

	private String nome;
	private String modalidade;
	private int cod;
	
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
	
}
