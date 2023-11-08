package com.vastidev.coopvotes.pauta.application.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaApi {

    @PostMapping
    PautaCadastradaResponse cadastraPauta( @RequestBody NovaPautaRequest novapauta);



}
