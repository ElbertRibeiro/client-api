package com.example.com.controller;

import com.example.com.model.Cliente;
import com.example.com.repository.CLienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    final CLienteRepository clienteRepository;

    public ClientController(CLienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente addition(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
