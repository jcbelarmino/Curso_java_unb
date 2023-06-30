package tratamentoExcecao;

public class Uso {
	public static void main(String[] args) {
		try {
			// Código que pode gerar uma exceção, como divisão por zero
			int resultado = 10 / 0;
		} catch (ArithmeticException e) {
			// Código a ser executado caso ocorra uma exceção do tipo ArithmeticException
			System.out.println("Erro: divisão por zero!");
		}
	}
}
