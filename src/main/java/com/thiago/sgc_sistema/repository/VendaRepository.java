package com.thiago.sgc_sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.sgc_sistema.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
