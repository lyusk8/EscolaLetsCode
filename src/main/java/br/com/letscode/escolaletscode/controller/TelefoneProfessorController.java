package br.com.letscode.escolaletscode.controller;

import br.com.letscode.escolaletscode.entity.TelefoneProfessor;
import br.com.letscode.escolaletscode.repository.TelefoneProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefone-professor")
public class TelefoneProfessorController {

    private final TelefoneProfessorRepository telefoneProfessorRepository;

    @Autowired
    public TelefoneProfessorController(TelefoneProfessorRepository telefoneProfessorRepository){
        this.telefoneProfessorRepository = telefoneProfessorRepository;
    }

    public Iterable<TelefoneProfessor> buscaTelefoneProfessor(){
        return telefoneProfessorRepository.findAll();
    }
}
