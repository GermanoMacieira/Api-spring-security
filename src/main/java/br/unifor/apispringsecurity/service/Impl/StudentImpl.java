package br.unifor.apispringsecurity.service.Impl;


import br.unifor.apispringsecurity.model.Student;
import br.unifor.apispringsecurity.repository.StudentRepository;
import br.unifor.apispringsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> listStudents() {

        return this.studentRepository.findAll();
    }

    @Override
    public Student listStudentById(long idStudent) {
        Optional<Student> optionalStudent = this.studentRepository.findById(idStudent);
        return new Student(optionalStudent.get());
    }

    @Override
    public Student insertStudent(Student student) {
        return this.studentRepository.save(student);
    }
}
