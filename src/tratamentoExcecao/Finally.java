package tratamentoExcecao;

import java.io.File;
import java.io.FileWriter;

public class Finally {
	public static void main(String[] args) {
		try {
			FileWriter arquivo = new FileWriter(new File("teste"));
			// Código que pode gerar uma exceção
		} catch (Exception e) {
			// Código a ser executado caso ocorra uma exceção
		} finally {
			// Código a ser executado sempre, independentemente de ocorrer exceção ou não
			// Por exemplo, fechar um arquivo aberto anteriormente
			arquivo.close();
		}
	}
}
