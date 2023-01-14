
package br.unifor.apispringsecurity.service;

import br.unifor.apispringsecurity.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> listStudents();
    public Student listStudentById(long idStudent);
    public Student insertStudent(Student student);

}
