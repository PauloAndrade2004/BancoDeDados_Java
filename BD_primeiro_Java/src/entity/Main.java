package entity;

import DAO.UsuarioDAO;

public class Main {
    public static void main(String[] args) {

//        //Criando o Objeto usuario
//        Aluno usuarioPaulo = new Aluno();
//        usuarioPaulo.setNome("Paulo");
//        usuarioPaulo.setLogin("teste");
//        usuarioPaulo.setSenha("123456");
//        usuarioPaulo.setEmail("pcesarand@gmal.com");
//        //Precisamos instânciar o usuario DAO
//        new UsuarioDAO().cadastrarUsuario(usuarioPaulo);
//
//        //criando um novo usuario
//        Aluno usuarioGabrielle = new Aluno();
//        usuarioGabrielle.setNome("Gbarielle");
//        usuarioGabrielle.setLogin("Gabis");
//        usuarioGabrielle.setSenha("1234");
//        usuarioGabrielle.setEmail("OliveiraCarlos276@gmail.com");
//        new UsuarioDAO(). cadastrarUsuario(usuarioGabrielle);
//
//        //criando um novo usuario
//        Aluno usuarioCarlos = new Aluno();
//        usuarioCarlos.setNome("Carlos");
//        usuarioCarlos.setLogin("Car");
//        usuarioCarlos.setSenha("1234e");
//        usuarioCarlos.setEmail("ceduardoandrade@gmail.com");
//        new UsuarioDAO(). cadastrarUsuario(usuarioCarlos);

        //criando um novo usuario
        Aluno usuarioClaudia = new Aluno();
        usuarioClaudia.setNome("Claudia");
        usuarioClaudia.setLogin("clau");
        usuarioClaudia.setSenha("1234e");
        usuarioClaudia.setEmail("ClaudiaJiane@gmail.com");
        new UsuarioDAO(). cadastrarUsuario(usuarioClaudia);



    }
}
