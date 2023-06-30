package aula6calculadora.serializacao;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private String nome;
	private int idade;

	// Construtor, getters e setters...

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
