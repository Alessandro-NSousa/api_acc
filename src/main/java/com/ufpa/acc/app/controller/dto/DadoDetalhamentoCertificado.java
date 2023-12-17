package com.ufpa.acc.app.controller.dto;

import com.ufpa.acc.app.controller.DadosCadastroCertificado;
import com.ufpa.acc.app.domain.Certificado;
import com.ufpa.acc.app.domain.enumerations.Modalidade;

public record DadoDetalhamentoCertificado(Long id, String titulo, String descricao, Modalidade modalidade, String aluno) {
    public DadoDetalhamentoCertificado(Certificado certificado){
        this(certificado.getId(), certificado.getTitulo(), certificado.getDescricao()
                ,certificado.getModalidade(), certificado.getAluno().getNome());
    }
}
