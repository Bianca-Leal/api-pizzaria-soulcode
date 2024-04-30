package com.pizzaria.pizzariaapi.controller;

import com.pizzaria.pizzariaapi.model.Cliente;
import com.pizzaria.pizzariaapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping(value = "/cadcliente", method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @RequestMapping(value = "/mostraclientes", method = RequestMethod.GET)
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @RequestMapping(value = "/mostracliente/{id}", method = RequestMethod.GET)
    public Cliente findById(@PathVariable long id) {
        Optional<Cliente> resultado = clienteRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        } else {
            return resultado.get();
        }
    }

    @RequestMapping(value = "/excluircliente/{id}", method = RequestMethod.DELETE)
    public Cliente deleteById(@PathVariable long id) {
        Cliente cliente = findById(id); // Reaproveita o método findById acima
        clienteRepository.deleteById(id);
        return cliente;
    }

    @RequestMapping(value = "/editarcliente/{id}", method = RequestMethod.PUT)
    public Cliente updateById(@PathVariable long id, @RequestBody Cliente cliente) {
        findById(id); // Checa se o cliente existe e lança exceção se não
        cliente.setIdCliente(id);
        return clienteRepository.save(cliente);
    }
}
