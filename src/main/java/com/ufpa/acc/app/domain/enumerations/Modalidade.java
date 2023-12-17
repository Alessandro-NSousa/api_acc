package com.ufpa.acc.app.domain.enumerations;

import java.util.ArrayList;
import java.util.List;

public enum Modalidade {
    LOCAL("Local"), REGIONAL("Regional"), NACIONAL("Nacional")
    , INTERNACIONAL("Internacional"), ONLINE("Online");

    private String nome;

    Modalidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static List<Modalidade> getAllNomes() {
        List<Modalidade> l = new ArrayList<>();
        l.add(LOCAL);
        l.add(REGIONAL);
        l.add(NACIONAL);
        l.add(INTERNACIONAL);
        l.add(ONLINE);
        return l;
    }
}
