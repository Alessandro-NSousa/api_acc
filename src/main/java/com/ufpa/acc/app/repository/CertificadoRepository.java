package com.ufpa.acc.app.repository;

import com.ufpa.acc.app.domain.Certificado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {
//    Page<Certificado> findCertificadoByAluno_Id(Long idAluno, Pageable pageable);
    Page<Certificado> findCertificadoByAluno_Id(Long idAluno,Pageable pageable);
    @Query("""
    select c from Certificado c
    where 
    c.aluno.id = :idAluno
    order by c.id

    """)
    List<Certificado> certificadosAluno(Long idAluno);
}
