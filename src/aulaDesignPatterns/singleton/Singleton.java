package aulaDesignPatterns.singleton;

public class Singleton {
	private static Singleton instance;

	// Construtor privado para impedir a criação de instâncias diretamente
	private Singleton() {
	}

	// Método estático para obter a única instância da classe
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Métodos da classe Singleton
	public void doSomething() {
		System.out.println("Singleton está fazendo algo.");
	}
}