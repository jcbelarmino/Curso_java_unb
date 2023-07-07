package aulaGenerics;

class ClassePai<T> {
	private T conteudo;

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}
}

class ClasseFilha<T> extends ClassePai<T> {
	// Aqui, a ClasseFilha herda a funcionalidade da ClassePai, incluindo seus
	// métodos e lógica
	// Além disso, ClasseFilha pode adicionar parâmetros de tipo adicionais ou
	// especializados
}

public class ExemploHerancaGenerics {
	public static void main(String[] args) {
		ClasseFilha<Integer> objeto = new ClasseFilha<>();
		objeto.setConteudo(42);
		Integer conteudo = objeto.getConteudo();
		System.out.println("Conteúdo: " + conteudo);
	}
}
