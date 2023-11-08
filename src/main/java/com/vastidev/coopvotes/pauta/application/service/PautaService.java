package com.vastidev.coopvotes.pauta.application.service;

import com.vastidev.coopvotes.pauta.application.api.NovaPautaRequest;
import com.vastidev.coopvotes.pauta.application.api.PautaCadastradaResponse;
import org.springframework.stereotype.Service;

@Service
public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novapauta);
}
