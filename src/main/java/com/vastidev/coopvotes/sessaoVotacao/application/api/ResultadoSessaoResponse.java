package com.vastidev.coopvotes.sessaoVotacao.application.api;

import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import com.vastidev.coopvotes.sessaoVotacao.domain.StatusSessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
public class ResultadoSessaoResponse {
    private UUID id;
    private UUID idPauta;
    private StatusSessaoVotacao status;
    private LocalDateTime momentoAbertura;
    private LocalDateTime momentoEncerramento;
    private Long TotalVotos;
    private Long TotalSim;
    private Long Totalnao;

    public ResultadoSessaoResponse(SessaoVotacao sessao) {
        this.id = sessao.getId();
        this.idPauta = sessao.getIdPauta();
        this.status = sessao.getStatus();
        this.momentoAbertura = sessao.getMomentoAbertura();
        this.momentoEncerramento = sessao.getMomentoEncerramento();
        TotalVotos = sessao.getTotalVotos();
        TotalSim = sessao.getTotalSim();
        Totalnao = sessao.getTotalNao();
    }
}

