package br.unifor.apispringsecurity.service.Impl;

import br.unifor.apispringsecurity.model.Student;
import br.unifor.apispringsecurity.model.dto.StudentDto;
import br.unifor.apispringsecurity.repository.StudentRepository;
import br.unifor.apispringsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository StudentRepository;

    @Override
    public List<Student> listStudents() {
        return this.StudentRepository.findAll();
    }
}
