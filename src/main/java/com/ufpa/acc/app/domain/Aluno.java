package com.ufpa.acc.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Table(name = "alunos")
@Entity(name = "Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean ativo;
    private String nome;
    private String numeroMatricula;
    private String login;
    private String senha;

//    private Turma turma;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Certificado> certificados;
}
