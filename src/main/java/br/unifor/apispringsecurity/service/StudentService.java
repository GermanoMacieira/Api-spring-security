package br.unifor.apispringsecurity.service;

import br.unifor.apispringsecurity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentService {
    List<Student> listStudents();

}
