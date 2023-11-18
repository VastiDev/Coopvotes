package com.vastidev.coopvotes.sessaoVotacao.domain;

import com.vastidev.coopvotes.sessaoVotacao.application.api.ResultadoSessaoResponse;

public interface PublicadorResultadoSessao {
    void publica(ResultadoSessaoResponse resultadoSessaoResponse);
}
