package com.pizzaria.pizzariaapi.repository;

import com.pizzaria.pizzariaapi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
