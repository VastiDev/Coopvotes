package com.vastidev.coopvotes.sessaoVotacao.application.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao/abertura")
public interface SessaoVotacaoAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    SessaoAberturaResponse abreSessao(@RequestBody SessaoAberturaRequest novasessao);

}
