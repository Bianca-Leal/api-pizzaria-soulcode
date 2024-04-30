package com.pizzaria.pizzariaapi.controller;

import com.pizzaria.pizzariaapi.model.Pizza;
import com.pizzaria.pizzariaapi.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @RequestMapping(value = "/cadpizza", method = RequestMethod.POST)
    public Pizza save(@RequestBody Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @RequestMapping(value = "/mostrapizzas", method = RequestMethod.GET)
    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    @RequestMapping(value = "/mostrapizza/{id}", method = RequestMethod.GET)
    public Pizza findById(@PathVariable long id) {
        Optional<Pizza> resultado = pizzaRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Pizza não encontrada");
        } else {
            return resultado.get();
        }
    }

    @RequestMapping(value = "/excluirpizza/{id}", method = RequestMethod.DELETE)
    public Pizza deleteById(@PathVariable long id) {
        Pizza pizza = findById(id);
        pizzaRepository.deleteById(id);
        return pizza;
    }

    @RequestMapping(value = "/editarpizza/{id}", method = RequestMethod.PUT)
    public Pizza updateById(@PathVariable long id, @RequestBody Pizza pizza) {
        findById(id);
        pizza.setIdPizza(id);
        return pizzaRepository.save(pizza);
    }
}
