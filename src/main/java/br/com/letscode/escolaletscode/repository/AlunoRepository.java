package br.com.letscode.escolaletscode.repository;

import br.com.letscode.escolaletscode.entity.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {


}
