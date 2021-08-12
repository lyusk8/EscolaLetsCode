package br.com.letscode.escolaletscode.repository;

import br.com.letscode.escolaletscode.entity.CursoDisciplinaProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoDisciplinaProfessorRepository extends JpaRepository<CursoDisciplinaProfessor, Integer> {
}
