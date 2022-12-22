package br.unifor.apispringsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    // ATRIBUTOS:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
    // @NotEmpty(message = "Nome do estudante é obrigatório!")
    private String nomeStudent;
    private String emailStudent;

    // CONSTRUTOR:

    public Student() {
    }

    public Student(Long isStudent, String nomeStudent, String emailStudent) {
        this.idStudent = isStudent;
        this.nomeStudent = nomeStudent;
        this.emailStudent = emailStudent;
    }
    // GETTER-SETTER:

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNomeStudent() {
        return nomeStudent;
    }

    public void setNomeStudent(String nomeStudent) {
        this.nomeStudent = nomeStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }
}
