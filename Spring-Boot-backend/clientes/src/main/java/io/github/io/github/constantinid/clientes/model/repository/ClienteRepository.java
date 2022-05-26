package io.github.io.github.constantinid.clientes.model.repository;

import io.github.io.github.constantinid.clientes.model.entiry.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
