package aulaGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedTypes {
	// Método que imprime os elementos de uma lista utilizando o upper bounded
	// wildcard
	public static void imprimirElementos(List<? extends Number> lista) {
		for (Number elemento : lista) {
			System.out.println(elemento);
		}
	}

	// Método que adiciona elementos a uma lista utilizando o lower bounded wildcard
	public static void adicionarElemento(List<? super Integer> lista) {
		lista.add(10);
		lista.add(20);
		lista.add(30);
	}

	public static void main(String[] args) {
		List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5);
		imprimirElementos(inteiros); // Utilizando o método com o upper bounded wildcard

		List<Double> numerosReais = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
		imprimirElementos(numerosReais); // Utilizando o método com o upper bounded wildcard

		List<Number> numeros = new ArrayList<>();
		adicionarElemento(numeros); // Utilizando o método com o lower bounded wildcard
		System.out.println(numeros);
	}

}
