package com.castelo.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class PessoaDao{

 public void cadastrarPessoa(PessoaPojo pessoa){

    Conexao conexao = new Conexao();

    String sql = "INSERT INTO PESSOA (NOME, IDADE, ENDERECO) VALUES (?, ?, ?)";

    PreparedStatement ps = null;

    try {

        ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, pessoa.getNome());
        ps.setInt(2, pessoa.getIdade());
        ps.setString(3, pessoa.getEndereco());
        
        ps.execute();
        ps.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
 }
}

