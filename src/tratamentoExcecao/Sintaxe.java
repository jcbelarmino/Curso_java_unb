package tratamentoExcecao;

public class Sintaxe {
	public static void main(String[] args) {
		try {
			// Código que pode gerar uma exceção
		} catch (TipoDeExceção1 exceção1) {
			// Código a ser executado caso a exceção1 seja lançada
		} catch (TipoDeExceção2 exceção2) {
			// Código a ser executado caso a exceção2 seja lançada
		} finally {
			// Código opcional a ser executado sempre, independentemente de ocorrer exceção
			// ou não
		}

	}

}
