package com.pizzaria.pizzariaapi.repository;

import com.pizzaria.pizzariaapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
