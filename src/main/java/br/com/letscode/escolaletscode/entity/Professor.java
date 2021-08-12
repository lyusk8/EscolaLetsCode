package br.com.letscode.escolaletscode.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @Column(name = "registro_professor")
    private int registroProfessor;
    private String nome;
}



