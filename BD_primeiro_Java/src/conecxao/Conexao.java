package conecxao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //Conexão static, padrão que podemos trabalhar.
    private static String url = "jdbc:mysql://localhost:3306/bdjava";
    private static final String usuario = "root"; //Nome que definimos na instalação do Mysql
    private static final String senha = "040704Pc";


    //Criando objeto connection
    private static Connection conn;

    //Criando metodo static, verifica se a conexão ja foi instanciada alguma vez
    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, usuario, senha);//Criando a conexão com Banco
            return conn;
        }else {
            return conn;
        }
    }
}
