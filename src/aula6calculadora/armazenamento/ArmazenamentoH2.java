package aula6calculadora.armazenamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import aula6calculadora.framework.Nodo;
import aula6calculadora.framework.Operacao;


// Implementação do armazenamento em banco de dados H2
public class ArmazenamentoH2 implements Armazenamento {
    private Connection connection;

    public ArmazenamentoH2() {
        try {
            // Carrega o driver JDBC do H2 e cria a conexão com o banco de dados
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarExpressao(String id, String expressao) {
       
    }

    @Override
    public void salvarOperacao(String id, Nodo operacao) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO operacoes (id, operacao) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setObject(2, operacao, Types.OTHER);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
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
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT operacao FROM operacoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  (Operacao) resultSet.getObject("operacao"); 
            }
        } catch (SQLException e) {
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
