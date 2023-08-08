package com.tmax.orderservice.repository;

import com.tmax.orderservice.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
