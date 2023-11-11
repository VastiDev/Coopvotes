package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);

    SessaoVotacao buscaPorId(UUID idSessao);
}
