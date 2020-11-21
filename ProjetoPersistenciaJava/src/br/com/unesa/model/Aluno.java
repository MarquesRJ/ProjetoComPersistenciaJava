package br.com.unesa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @brief Classe filha aluno, herda tudo de Pessoa.
 * @date 20/11/2020.
 */

@Entity
@DiscriminatorValue( value="Aluno" )
public class Aluno extends Pessoa {
    
    public Aluno(){}

    public Aluno(long id, String nome, String idade, String cpf, String email, String turno) {
        super(id, nome, idade, cpf, email, turno);
    }
    private String dependencia;
    private String curso;

    

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
