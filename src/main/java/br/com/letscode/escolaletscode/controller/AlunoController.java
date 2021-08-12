package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.Aluno;
import br.com.letscode.escolaletscode.repository.AlunoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/alunos")
@RestController
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public Iterable<Aluno> buscarAlunos(){
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
        return aluno;
    }
}
