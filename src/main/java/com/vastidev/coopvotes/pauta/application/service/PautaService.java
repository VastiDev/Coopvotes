package com.vastidev.coopvotes.pauta.application.service;

import com.vastidev.coopvotes.pauta.application.api.NovaPautaRequest;
import com.vastidev.coopvotes.pauta.application.api.PautaCadastradaResponse;
import com.vastidev.coopvotes.pauta.domain.Pauta;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novapauta);

    Pauta getPautaPorId(UUID idPauta);
}
