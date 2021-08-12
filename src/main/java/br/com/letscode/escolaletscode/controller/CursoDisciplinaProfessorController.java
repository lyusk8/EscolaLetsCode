package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.CursoDisciplinaProfessor;
import br.com.letscode.escolaletscode.repository.CursoDisciplinaProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/disciplina-professor")
public class CursoDisciplinaProfessorController {

    private final CursoDisciplinaProfessorRepository cursoDisciplinaProfessorRepository;

    @Autowired
    public CursoDisciplinaProfessorController(CursoDisciplinaProfessorRepository cursoDisciplinaProfessorRepository){
        this.cursoDisciplinaProfessorRepository = cursoDisciplinaProfessorRepository;
    }

    @GetMapping
    public List<CursoDisciplinaProfessor> buscarDisciplinaProfessor(){
        return cursoDisciplinaProfessorRepository.findAll();
    }
}
