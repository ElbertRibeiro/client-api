package com.example.crm.repository;

import com.example.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface CLienteRepository extends JpaRepository<Cliente, Long> {
}
