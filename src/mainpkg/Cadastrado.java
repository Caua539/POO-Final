package mainpkg;

import java.io.Serializable;
public class Cadastrado 
			implements Serializable {
	
	protected String matricula;
	protected String nome;
	protected String senha;
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
