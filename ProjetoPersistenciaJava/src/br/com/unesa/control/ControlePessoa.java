package br.com.unesa.control;

import br.com.unesa.model.Pessoa;
import br.com.unesa.model.PessoaDAO;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @brief Classe intermediaria, faz o controle entra a classe DAO e a view.
 * @date 20/11/2020.
 */

public class ControlePessoa {

    private final PessoaDAO DAO = new PessoaDAO();

    public void inserir(Pessoa pessoa){
        DAO.inserir(pessoa);
    }

    public void excluir(long id) {
        DAO.excluir(id);
    }

    public void consultarPorId(long id) {
        DAO.consultarPorId(id);
    }
}
