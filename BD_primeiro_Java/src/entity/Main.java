package entity;

import DAO.UsuarioDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Aluno usuarioDiomeneis = new Aluno();
       usuarioDiomeneis.setNome("Diomeneis");
       usuarioDiomeneis.setLogin("Castor");
       usuarioDiomeneis.setSenha("12345");
       usuarioDiomeneis.setEmail("DiomeneisAndrade@gmail.com");
       new UsuarioDAO().cadastrarUsuario(usuarioDiomeneis);







    }
}
