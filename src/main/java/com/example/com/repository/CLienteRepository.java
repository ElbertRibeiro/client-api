package com.example.com.repository;

import com.example.com.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface CLienteRepository extends JpaRepository<Cliente, Long> {
}
