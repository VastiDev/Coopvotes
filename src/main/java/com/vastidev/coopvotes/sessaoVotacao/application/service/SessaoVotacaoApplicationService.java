package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.pauta.application.service.PautaRepository;
import com.vastidev.coopvotes.pauta.application.service.PautaService;
import com.vastidev.coopvotes.pauta.domain.Pauta;
import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaRequest;
import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaResponse;
import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaoVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoApplicationService - abreSessao ");
        Pauta pauta = pautaService.getPautaPorId(sessaoAberturaRequest.getIdPauta());
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest, pauta));
        log.info("[finish] SessaoVotacaoApplicationService - abreSessao ");
        return new SessaoAberturaResponse(sessaoVotacao);
    }
}
