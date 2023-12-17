package com.ufpa.acc.app.controller;

import com.ufpa.acc.app.controller.dto.DadoDetalhamentoCertificado;
import com.ufpa.acc.app.controller.dto.DetalhamentoListagemCertificados;
import com.ufpa.acc.app.domain.Certificado;
import com.ufpa.acc.app.repository.AlunoRepository;
import com.ufpa.acc.app.repository.CertificadoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoRepository certificadoRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/{aluno_id}")
    @Transactional
    public ResponseEntity cadastrarCertificado(@PathVariable(value = "aluno_id") Long alunoId,@RequestBody @Valid DadosCadastroCertificado dados, UriComponentsBuilder uriBuilder) {
        var aluno = alunoRepository.getReferenceById(alunoId);

        var certificado = new Certificado(dados);
        certificado.setAluno(aluno);
        certificadoRepository.save(certificado);

        var uri = uriBuilder.path("/certificados/{id}").buildAndExpand(certificado.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadoDetalhamentoCertificado(certificado));
    }

    @GetMapping
    public ResponseEntity<Page<DetalhamentoListagemCertificados>> listar(@PageableDefault(size = 20, sort = {"descricao"})Pageable pageable){
        var certificados = certificadoRepository.findAll(pageable).map(DetalhamentoListagemCertificados::new);
        return ResponseEntity.ok(certificados);
    }

    @GetMapping("/{alunoId}")
    public ResponseEntity<Page<DetalhamentoListagemCertificados>> listarCertificadosPorAluno(@PageableDefault(size = 5,sort = {"id"}) Pageable page,
                                                                        @PathVariable Long alunoId) {

        var aluno = alunoRepository.getReferenceById(alunoId);
        var certificados = certificadoRepository
                .findCertificadoByAluno_Id(aluno.getId(), page)
                .map(DetalhamentoListagemCertificados::new);

        return ResponseEntity.ok(certificados);
    }

}
