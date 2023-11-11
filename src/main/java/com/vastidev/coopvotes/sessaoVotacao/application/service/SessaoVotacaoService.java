package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaRequest;
import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaResponse;
import com.vastidev.coopvotes.sessaoVotacao.application.api.VotoRequest;
import com.vastidev.coopvotes.sessaoVotacao.application.api.VotoResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}
