package br.unifor.apispringsecurity.controller;

import br.unifor.apispringsecurity.model.Student;
import br.unifor.apispringsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // LISTAR TODOS:
    @GetMapping(value="/listall")
    List<Student> listStudents() {

        return this.studentService.listStudents();
    }
}
