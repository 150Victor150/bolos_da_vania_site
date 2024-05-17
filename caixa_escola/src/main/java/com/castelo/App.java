package com.castelo;

import com.castelo.dao.PessoaDao;
import com.castelo.dao.PessoaPojo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {

        PessoaPojo p = new PessoaPojo();
        p.setNome("rogerio");
        p.setIdade(25);
        p.setEndereco("Rua Java é foda, 666");

        new  PessoaDao().cadastrarPessoa(p);
    }
}
