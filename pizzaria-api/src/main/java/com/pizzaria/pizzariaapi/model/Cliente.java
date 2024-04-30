package com.pizzaria.pizzariaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;
}
