package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.sessaoVotacao.application.api.*;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);

    ResultadoSessaoResponse obtemResultado(UUID idSessao);
}
