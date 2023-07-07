package aulaGenerics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Hello");
		String elemento = lista.get(0);
		
//		Após o type erasure, o código seria convertido para:
		List lista = new ArrayList();
		lista.add("Hello");
		String elemento = (String) lista.get(0);

	}
}
