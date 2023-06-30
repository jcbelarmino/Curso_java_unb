package aula6calculadora.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserializacao {
	public static void main(String[] args) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("pessoa.ser"))) {
			Pessoa pessoa = (Pessoa) inputStream.readObject();
			System.out.println("Objeto deserializado: " + pessoa.getNome() + ", " + pessoa.getIdade());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}