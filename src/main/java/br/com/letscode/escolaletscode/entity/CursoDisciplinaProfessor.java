package br.com.letscode.escolaletscode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "curso_disciplina")
public class CursoDisciplinaProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne @JoinColumn(name = "codigo_curso", referencedColumnName = "codigo_curso")
    private Curso codigoCurso;

    @ManyToOne @JoinColumn(name = "codigo_disciplina", referencedColumnName = "codigo_disciplina")
    private Disciplina codigoDisciplina;

    @ManyToOne @JoinColumn(name = "registro_professor", referencedColumnName = "registro_professor")
    private Professor registroProfessor;


}
