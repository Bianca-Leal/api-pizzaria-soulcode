package com.pizzaria.pizzariaapi.controller;

import com.pizzaria.pizzariaapi.model.Bebida;
import com.pizzaria.pizzariaapi.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;

    @RequestMapping(value = "/cadbebida", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    @RequestMapping(value = "/mostrabebidas", method = RequestMethod.GET)
    public List<Bebida> findAll() {
        return bebidaRepository.findAll();
    }

    @RequestMapping(value = "/mostrabebida/{id}", method = RequestMethod.GET)
    public Bebida findById(@PathVariable long id) {
        Optional<Bebida> resultado = bebidaRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Bebida não encontrada");
        } else {
            return resultado.get();
        }
    }

    @RequestMapping(value = "/excluirbebida/{id}", method = RequestMethod.DELETE)
    public Bebida deleteById(@PathVariable long id) {
        Bebida bebida = findById(id);
        bebidaRepository.deleteById(id);
        return bebida;
    }

    @RequestMapping(value = "/editarbebida/{id}", method = RequestMethod.PUT)
    public Bebida updateById(@PathVariable long id, @RequestBody Bebida bebida) {
        findById(id);
        bebida.setIdBebida(id);
        return bebidaRepository.save(bebida);
    }
}
