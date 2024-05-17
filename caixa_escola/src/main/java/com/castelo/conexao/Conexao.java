package com.castelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;




public class Conexao {

    private String url = "jdbc:mysql://127.0.0.1:3306/caixa";
    private String user = "root";
    private String password = "";
    
    private Connection conn;

    public Connection getConexao(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o banco bem sucessedida");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro na conexão");
        }
        return null;
    }
}
