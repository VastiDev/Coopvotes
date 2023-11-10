package com.vastidev.coopvotes.pauta.application.service;

import com.vastidev.coopvotes.pauta.domain.Pauta;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PautaRepository {
    Pauta salva(Pauta pauta);

    Pauta buscaPautaPorId(UUID idPauta);
}
