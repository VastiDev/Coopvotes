package com.vastidev.coopvotes.sessaoVotacao.application.service;

import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);
}
