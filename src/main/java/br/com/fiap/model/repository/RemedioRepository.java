package br.com.fiap.model.repository;

import br.com.fiap.model.entity.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {
    Remedio findByCodigo(long codigo);
    Remedio existsById(long codigo);
    Remedio deleteById(long codigo);

}

