package com.vastidev.coopvotes.sessaoVotacao.infra;

import com.vastidev.coopvotes.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepository extends JpaRepository<SessaoVotacao, UUID> {
}
