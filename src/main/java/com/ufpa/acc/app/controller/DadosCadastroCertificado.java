package com.ufpa.acc.app.controller;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroCertificado(@NotNull
                                       String descricao,
                                       Long idAluno
) {
}
