package aula3oo.heranca;

public class Animal {
	private String nome;

	// Construtor
	public Animal(String nome) {
		this.nome = nome;
	}
	public Animal() {
		nome = "SEM NOME"; 
	}
    
	public String getNome() {
		return nome;
	}

	public void emitirSom() {
		System.out.println("O animal emite um som.");
	}
}