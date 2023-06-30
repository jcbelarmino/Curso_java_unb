package aula3oo.heranca;

public class Cachorro extends Animal {
	public Cachorro(String n) {
		super(n);
	}

	@Override
	public void emitirSom() {		
		System.out.println("O cachorro late.");
	}
	

	public static void main(String[] args) {
		Cachorro c = new Cachorro("Léia");
		c.emitirSom();
		System.out.println("antes " + c.nome);
		c.nome = "linus";
		System.out.println("depois " +c.nome);
		
	}
}