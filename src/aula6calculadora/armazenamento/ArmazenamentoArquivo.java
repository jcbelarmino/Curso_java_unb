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
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_operacao.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(operacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void salvarResultado(String id, int resultado) {
		
	}

	@Override
	public String recuperarExpressao(String id) {
		
	}

	@Override
	public Operacao recuperarOperacao(String id) {
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_operacao.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Operacao) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int recuperarResultado(String id) {
		
	}

	@Override
	public List<String> listarExpressoes() {
		
	}

	
		
}