
package br.unifor.apispringsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    // ATRIBUTOS:
    @Id     // Anotação que indica que o atributo será a chave primária da tabela;
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Anotação que indica o auto incremento do id na tabela do banco de dados;
    private Long idStudent;

    // NotNull: Não permite valor nulo.
    // NotEmpty: Não permite valor nulo ou vazio
    // NotBlank: Não permite valor nulo, nem vazio, após remover os espaços nas extremidades da String com trim.
    // @NotBlank(message = "Nome do estudante é obrigatório!")
    private String nameStudent;
    private String emailStudent;

    // CONSTRUTOR:

    public Student() {
    }

    public Student(Long idStudent, String nameStudent, String emailStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
    }

    public Student(Student student) {

    }
    // GETTER-SETTER:

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }
}
