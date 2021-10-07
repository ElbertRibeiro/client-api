package com.example.crm.controller;

import com.example.crm.model.Cliente;
import com.example.crm.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/clients") public class ClientController {

    private final CLienteRepository ClienteRepository;

    @Autowired
    public ClientController(CLienteRepository ClienteRepository) {
        this.ClienteRepository = ClienteRepository;
    }

    @GetMapping public List<Cliente> list() {
        return ClienteRepository.findAll();
    }

    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Cliente addition(@RequestBody Cliente cliente) {
        return ClienteRepository.save(cliente);
    }
}
