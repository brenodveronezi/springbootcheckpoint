package com.brenodveronezi.desafiospringboot.repository;

import com.brenodveronezi.desafiospringboot.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
