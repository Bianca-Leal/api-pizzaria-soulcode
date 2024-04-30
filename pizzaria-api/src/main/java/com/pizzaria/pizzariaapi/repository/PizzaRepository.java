package com.pizzaria.pizzariaapi.repository;

import com.pizzaria.pizzariaapi.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
