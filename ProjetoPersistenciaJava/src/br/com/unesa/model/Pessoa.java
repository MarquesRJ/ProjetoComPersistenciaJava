package br.com.unesa.model;

/**
 *
 * @author Jonas Silva Carvalho
 * @author Gabriel Henrique Santos Marques
 * @author Marlon Ribeiro da Silva
 */
public class Pessoa {

    private int id;
    private String nome;
    private String idade;
    private String cpf;
    private String email;

    public Pessoa(int id, String nome, String idade, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
