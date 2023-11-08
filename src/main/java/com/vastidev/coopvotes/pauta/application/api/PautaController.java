package com.vastidev.coopvotes.pauta.application.api;

import com.vastidev.coopvotes.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/pauta")
public class PautaController implements PautaApi {
    private final PautaService pautaService;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novapauta) {
        log.info("[start] PautaController - cadastraPauta");
        PautaCadastradaResponse pautaCadastrada = pautaService.cadastraPauta(novapauta);
        log.info("[finish] PautaController - cadastraPauta");
        return pautaCadastrada;
    }
}
