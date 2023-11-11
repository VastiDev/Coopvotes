package com.vastidev.coopvotes.sessaoVotacao.application.api;


import com.vastidev.coopvotes.sessaoVotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoController implements SessaoVotacaoAPI {
    private final SessaoVotacaoService sessaoVotacaoService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaovotacaoController - abreSessao ");
        SessaoAberturaResponse sessaoAberturaResponse = sessaoVotacaoService.abreSessao(sessaoAberturaRequest);
        log.info("[finish] SessaovotacaoController - abreSessao ");
        return sessaoAberturaResponse;
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.info("[start] SessaovotacaoController - recebeVoto ");
        VotoResponse votoResponse = sessaoVotacaoService.recebeVoto(idSessao, novoVoto);
        log.info("[finish] SessaovotacaoController - recebeVoto ");
        return votoResponse;
    }
}
