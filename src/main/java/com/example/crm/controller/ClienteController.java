package com.example.crm.controller;

import com.example.crm.model.Cliente;
import com.example.crm.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/clientes") public class ClienteController {

    @Autowired private CLienteRepository cLienteRepository;

    @GetMapping public List<Cliente> listar() {
        return cLienteRepository.findAll();
    }

    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Cliente adicionar(@RequestBody Cliente cliente) {
        return cLienteRepository.save(cliente);
    }
}
