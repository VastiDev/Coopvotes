package com.vastidev.coopvotes.pauta.infra;

import com.vastidev.coopvotes.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJpaRepository extends JpaRepository<Pauta, UUID> {
}
