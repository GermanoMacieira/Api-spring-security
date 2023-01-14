
package br.unifor.apispringsecurity.controller;

import br.unifor.apispringsecurity.model.Student;
import br.unifor.apispringsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // LISTAR TODOS OS ESTUDANTES:
    @GetMapping(value="/list")  // Anotação do JPA que indica o "verbo" http, no caso, é um GET;
    List<Student> listStudents() {

        return this.studentService.listStudents();
    }

    // LISTAR UM ESTUDANTE POR ID:
    @GetMapping	("list/{idContato}")	// Anotação do JPA que indica o "verbo" http, no caso, é um GET/{id};
    public Student listStudentById(@PathVariable("idStudent") long idStudent) {
        return this.studentService.listStudentById(idStudent);
    }

    // INSERIR UM ESTUDANTE NOVO:
    @PostMapping(value="/insert")   // Anotação do JPA que indica o "verbo" http, no caso, é um POST;
    public Student insertStudent(@RequestBody Student student) {    // A anotação @RequestBody indica que o valor do objeto virá do corpo da requisição;

        return this.studentService.insertStudent(student);
    }
}
