package com.ufpa.acc.app.controller;

import com.ufpa.acc.app.domain.Aluno;
import com.ufpa.acc.app.repository.AlunoRepository;
import com.ufpa.acc.app.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CertificadoRepository certificadoRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {

        Aluno novoAluno = alunoRepository.save(aluno);
        return ResponseEntity.ok(novoAluno);
    }


}
