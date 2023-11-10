package com.vastidev.coopvotes.sessaoVotacao.domain;

import com.vastidev.coopvotes.pauta.domain.Pauta;
import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SessaoVotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    private UUID idPauta;
    private Integer tempoDuracao;
    private StatusSessaoVotacao status;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;


    public SessaoVotacao(SessaoAberturaRequest sessaoAberturaRequest, Pauta pauta) {
        this.idPauta = pauta.getId();
        this.tempoDuracao = sessaoAberturaRequest.getTempoDuracao().orElse(1);
        this.dataAbertura = LocalDateTime.now();
        this.dataEncerramento = dataAbertura.plusMinutes(this.tempoDuracao);
        this.status = StatusSessaoVotacao.ABERTA;
    }
}
