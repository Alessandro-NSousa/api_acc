package com.ufpa.acc.app.controller.dto;

import com.ufpa.acc.app.domain.Certificado;
import org.springframework.data.domain.Page;

public record DetalhamentoListagemCertificados(Long id, String descricao, String alunoNome) {

    public DetalhamentoListagemCertificados(Certificado certificado){
        this(certificado.getId(), certificado.getDescricao(), certificado.getAluno().getNome());
    }
}
