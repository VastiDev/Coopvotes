package com.vastidev.coopvotes.associado.application.service;


import com.vastidev.coopvotes.associado.infra.client.ConsultaCpfResponse;
import com.vastidev.coopvotes.associado.infra.client.SerproClientFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AssociadoApplicationService implements AssociadoService {

    private final SerproClientFeign serproClientFeign;
    @Override
    public void validaAssociaddoAptoVoto(String cpfAssociado) {
        log.info("[start] AssociadoApplicationService - validaAssociaddoAptoVoto ");
        ConsultaCpfResponse consultaCpfResponse = serproClientFeign.consultaCPF(TOKEN, cpfAssociado);
        valida(consultaCpfResponse);
        log.info("[finish] AssociadoApplicationService - validaAssociaddoAptoVoto ");

    }
    private void valida(ConsultaCpfResponse consultaCpfResponse){
        if (consultaCpfResponse.isInvalid()){
            throw new RuntimeException("CPF associado inválido");
        }
    }
    private static final String TOKEN = "Bearer 06aef429-a981-3ec5-a1f8-71d38d86481e";
}

