package aula6calculadora.armazenamento;

import java.util.List;

import aula6calculadora.framework.Nodo;
import aula6calculadora.framework.Operacao;

public interface Armazenamento {
	public abstract void salvarExpressao(String id, String expressao);

	public abstract void salvarOperacao(String id, Nodo operacao);

	public abstract void salvarResultado(String id, int resultado);

	public abstract String recuperarExpressao(String id);

	public abstract Operacao recuperarOperacao(String id);

	public abstract int recuperarResultado(String id);

	public abstract List<String> listarExpressoes();

}
