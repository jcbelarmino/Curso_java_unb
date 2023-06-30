package aula6calculadora.serializacao;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))) {
            outputStream.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
