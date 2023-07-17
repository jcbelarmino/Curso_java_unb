package aulaDesignPatterns.singleton;

// Exemplo de uso do Singleton
public class MainSingleton {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.doSomething(); // Output: Singleton está fazendo algo.

		// Tentativa de criar uma nova instância do Singleton
		// Não é possível devido ao construtor privado
		// Singleton anotherInstance = new Singleton(); // Erro de compilação
	}
}
