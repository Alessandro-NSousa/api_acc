package com.ufpa.acc.app.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ufpa.acc.app.controller.DadosCadastroCertificado;
import com.ufpa.acc.app.domain.enumerations.Modalidade;
import com.ufpa.acc.app.domain.enumerations.StatusCertificado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "certificados")
@Entity(name = "Certificado")
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo; //add ok
//    private Date dataEnvio;
    private String observacao; //add ok
    private Integer ch; //add
    private Integer pontuacao; //add ok
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @Enumerated(EnumType.STRING) //add ok
    private Modalidade modalidade;

    @Enumerated(EnumType.STRING)
    private StatusCertificado status; //add ok

    public Certificado(DadosCadastroCertificado dados){
        this.descricao = dados.descricao();
    }
}
