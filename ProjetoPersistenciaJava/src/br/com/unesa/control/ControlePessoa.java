package br.com.unesa.control;

import br.com.unesa.model.Pessoa;
import br.com.unesa.model.PessoaDAO;

/**
 *
 * @author lenno
 */
public class ControlePessoa {

    private PessoaDAO DAO = new PessoaDAO();

    public void inserir(Pessoa pessoa) {
        DAO.inserir();
    }

    public void excluir(Pessoa pessoa) {
        DAO.excluir();
    }

    public void consultarPorId(long id) {
        DAO.consultarPorId();
    }
}
