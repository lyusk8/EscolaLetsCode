package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.Curso;
import br.com.letscode.escolaletscode.repository.CursoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }

    @GetMapping
    public List<Curso> buscaCursos(){
        return cursoRepository.findAll();
    }
}
