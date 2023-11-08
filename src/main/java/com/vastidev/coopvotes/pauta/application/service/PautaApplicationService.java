package com.vastidev.coopvotes.pauta.application.service;

import com.vastidev.coopvotes.pauta.application.api.NovaPautaRequest;
import com.vastidev.coopvotes.pauta.application.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novapauta) {
        log.info("[start] PautaApplicationService - cadastraPauta ");
        log.info("[novapauta] {}", novapauta);
        log.info("[finish] PautaApplicationService - cadastraPauta ");
        return null;
    }
}
