package br.com.unesa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.unesa.control.ControlePessoa;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @brief Classe que faz a persistencia com banco.
 * @date 20/11/2020.
 */
public class PessoaDAO {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            factory = Persistence.createEntityManagerFactory("PJPU");
            entityManager = factory.createEntityManager();
        } catch (Exception ex) {
            System.out.println("ERRO DE EXCEÇÃO");

        } finally {
            factory.close();
        }
        return entityManager;
    }

    public Pessoa inserir(Pessoa pessoa) {
        EntityManager entityManager = getEntityManager();

        try {
            entityManager.getTransaction().begin();

            if (pessoa.getId() == null) {
                entityManager.persist(pessoa);
            } else {
                pessoa = entityManager.merge(pessoa);
            }
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
        return pessoa;
    }

    public void excluir(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Pessoa pessoa = entityManager.find(Pessoa.class, id);
            entityManager.remove(pessoa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("ERRO DE EXCEÇÃO");
        } finally {
            entityManager.close();
        }
    }

    public Pessoa consultarPorId(Long id) {
        EntityManager entityManager = getEntityManager();
        Pessoa pessoa = null;
        try {
            pessoa = entityManager.find(Pessoa.class, id);
        } catch (Exception ex) {
            System.out.println("ERRO DE EXCEÇÃO");
        } finally {
            entityManager.close();
        }
        return pessoa;
    }
}
