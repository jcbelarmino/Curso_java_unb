package aula3oo;

//Interface que define a abstração de um animal
interface Animal {
	void emitirSom();

	void mover();
}

//Classe que implementa a abstração de Animal para um cachorro
class Cachorro implements Animal {
	String nome;

	public void emitirSom() {
		System.out.println("O cachorro late.");
	}

	public void mover() {
		System.out.println("O cachorro corre.");
	}
}

//Exemplo de uso da abstração
public class ExemploAbstracao2 {
	public static void main(String[] args) {
		Animal animal = new Cachorro();
		animal.emitirSom();
		animal.mover();
	}
}