package com.example.assistenzaclienti.repositories;

import com.example.assistenzaclienti.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClineteRepository extends JpaRepository<Cliente, Integer> {
}
