package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.Professor;
import br.com.letscode.escolaletscode.repository.ProfessorRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorRepository professorRepository;


    public ProfessorController(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    @GetMapping
    public List<Professor> buscarProfessores(){
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Professor> findProfessoresById(@PathVariable int id){
        return professorRepository.findById(id);
    }

    @PostMapping
    public Professor salvarProfessor(@RequestBody Professor professor){
        professorRepository.save(professor);
        return professor;
    }

    @DeleteMapping("/{id}")
    public void deletaProfessorById(@PathVariable int id){
        Professor apagado = professorRepository.getById(id);
        professorRepository.delete(apagado);
    }
}
