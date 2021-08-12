package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.Disciplina;
import br.com.letscode.escolaletscode.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaController(DisciplinaRepository disciplinaRepository){
        this.disciplinaRepository = disciplinaRepository;
    }

    public Iterable<Disciplina> buscarDisciplinas(){
        return disciplinaRepository.findAll();
    }
}
