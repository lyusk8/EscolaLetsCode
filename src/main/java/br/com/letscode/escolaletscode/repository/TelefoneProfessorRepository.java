package br.com.letscode.escolaletscode.repository;

import br.com.letscode.escolaletscode.entity.TelefoneProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneProfessorRepository extends JpaRepository<TelefoneProfessor, Integer> {

}
