package com.vastidev.coopvotes.pauta.domain;

import com.vastidev.coopvotes.pauta.application.api.NovaPautaRequest;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@ToString
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;

    public Pauta(NovaPautaRequest novapauta) {

        this.titulo = novapauta.getTitulo();
        this.descricao = novapauta.getDescricao();
        this.idAssociadoAutor = novapauta.getIdAssociadoAutor();
        this.dataCriacao = LocalDateTime.now();
    }

}
