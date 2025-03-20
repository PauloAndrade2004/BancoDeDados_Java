package DAO;

import conecxao.Conexao;
import entity.Aluno;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    //criando metodo de insertion de dados.
    public void cadastrarUsuario(Aluno aluno) {
        // Comandos de inserção de dados.
        // Escrever um comando SQL.
        String sql = "INSERT INTO aluno (idaluno, nome, login, senha, email) VALUES (?, ?, ?, ?, ?)";
        // Os pontos de ? representam os valores que eu vou mandar por parâmetros.

        PreparedStatement ps = null;

        // Utilizando a conexão que criamos
        try {
            ps = Conexao.getConnection().prepareStatement(sql);

            // Definindo os pontos de Interrogação
            ps.setInt(1, aluno.getIdAluno()); // Estabelecendo o valor para o campo idaluno
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getLogin());
            ps.setString(4, aluno.getSenha());
            ps.setString(5, aluno.getEmail());

            // Executa a conexão com Banco de Dados
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            e.printStackTrace(); // Para depuração
            throw new RuntimeException("Erro ao executar o comando SQL: " + e.getMessage(), e);
        }



    }


    public static void deletarAluno(int idAluno) {
        String sql = "DELETE FROM aluno WHERE idAluno = ?";
        PreparedStatement pss = null;

        try {
            pss = Conexao.getConnection(). prepareStatement(sql);

            pss.setInt(1, idAluno);


            pss.executeUpdate();
            pss.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
