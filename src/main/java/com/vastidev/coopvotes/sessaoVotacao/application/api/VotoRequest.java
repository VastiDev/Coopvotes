package com.vastidev.coopvotes.sessaoVotacao.application.api;

import com.vastidev.coopvotes.sessaoVotacao.domain.OpcaoVoto;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VotoRequest {
    private String cpfAssociado;
    private OpcaoVoto opcao;

}
