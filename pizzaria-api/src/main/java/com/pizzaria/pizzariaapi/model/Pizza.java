package com.pizzaria.pizzariaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPizza;

    @ManyToMany(mappedBy = "pizzas")
    private List<Pedido> pedidos;

}