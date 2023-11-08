package com.vastidev.coopvotes.pauta.infra;

import com.vastidev.coopvotes.pauta.application.service.PautaRepository;
import com.vastidev.coopvotes.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final  PautaSpringDataJpaRepository pautaSpringDataJpaRepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[start] PautaInfraRepository - salva ");
        pautaSpringDataJpaRepository.save(pauta);
        log.info("[finish] PautaInfraRepository - salva ");
        return pauta;
    }
}
