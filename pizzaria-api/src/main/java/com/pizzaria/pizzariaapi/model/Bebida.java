package com.pizzaria.pizzariaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida;


    @ManyToMany(mappedBy = "bebidas", fetch = FetchType.EAGER)
    private List<Pedido> pedidos = new ArrayList<>();

}
