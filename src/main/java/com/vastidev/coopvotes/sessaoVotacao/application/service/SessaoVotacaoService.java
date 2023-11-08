package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaRequest;
import com.vastidev.coopvotes.sessaoVotacao.application.api.SessaoAberturaResponse;
import org.springframework.stereotype.Service;

@Service
public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
