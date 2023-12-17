package com.ufpa.acc.app.repository;

import com.ufpa.acc.app.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    boolean existsByNumeroMatriculaOrLogin(String numeroMatricula, String login);
}
