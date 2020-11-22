package br.com.unesa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @brief Classe filha professor, herda tudo de Pessoa.
 * @date 20/11/2020.
 */
@Entity
@DiscriminatorValue(value = "Professor")

public class Professor extends Pessoa {

    public Professor() {
    }

    public Professor(long id, String nome, String idade, String cpf, String email, String turno) {
        super(id, nome, idade, cpf, email, turno);

    }
    private String salario;
    private String disciplina;
    private String turma;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
