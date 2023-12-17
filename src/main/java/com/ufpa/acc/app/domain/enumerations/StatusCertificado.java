package com.ufpa.acc.app.domain.enumerations;

import java.util.ArrayList;
import java.util.List;

public enum StatusCertificado {
    EM_ESPERA("Em Espera"), EM_AVALIACAO("Em Avaliação"), APROVADO_PARCIALMENTE("Aprovado Parcialmente")
    , CONCLUIDO("Concluído"), NAO_CONCLUIDO("Não Concluído"), REPROVADO("Reprovado");

    private String nome;

    StatusCertificado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static List<StatusCertificado> getAllNomes() {
        List<StatusCertificado> l = new ArrayList<>();
        l.add(EM_ESPERA);
        l.add(EM_AVALIACAO);
        l.add(APROVADO_PARCIALMENTE);
        l.add(CONCLUIDO);
        l.add(NAO_CONCLUIDO);
        l.add(REPROVADO);
        return l;
    }
}
