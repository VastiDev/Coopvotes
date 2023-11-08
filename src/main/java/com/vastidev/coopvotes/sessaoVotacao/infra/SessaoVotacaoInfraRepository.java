package com.vastidev.coopvotes.sessaoVotacao.infra;

import com.vastidev.coopvotes.sessaoVotacao.application.service.SessaoVotacaoRepository;
import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaoVotacaoInfraRepository - salva ");
        sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finish] SessaoVotacaoInfraRepository - salva ");
        return sessaoVotacao;
    }
}
