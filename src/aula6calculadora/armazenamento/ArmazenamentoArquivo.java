package aula6calculadora.armazenamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import aula6calculadora.framework.Nodo;
import aula6calculadora.framework.Operacao;

public class ArmazenamentoArquivo implements  Armazenamento {
	private String diretorio = "./";

	@Override
	public void salvarExpressao(String id, String expressao) {
	
	}

	@Override
	public void salvarOperacao(String id, Nodo operacao) {
	
	}

	@Override
	public void salvarResultado(String id, int resultado) {
		
	}

	@Override
	public String recuperarExpressao(String id) {
		
	}

	@Override
	public Operacao recuperarOperacao(String id) {
		
	}

	@Override
	public int recuperarResultado(String id) {
		
	}

	@Override
	public List<String> listarExpressoes() {}
	
		
}