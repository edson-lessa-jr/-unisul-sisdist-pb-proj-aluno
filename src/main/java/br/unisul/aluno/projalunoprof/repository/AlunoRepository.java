package br.unisul.aluno.projalunoprof.repository;

import br.unisul.aluno.projalunoprof.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno findFirstByNome(String nome);
}
