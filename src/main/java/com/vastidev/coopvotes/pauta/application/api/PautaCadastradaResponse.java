package com.vastidev.coopvotes.pauta.application.api;

import com.vastidev.coopvotes.pauta.domain.Pauta;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;
@Getter
@ToString
public class PautaCadastradaResponse {
    private UUID id;

    public PautaCadastradaResponse(Pauta pauta) {
        this.id = pauta.getId();
    }
}
