package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IhabilidadRepo extends JpaRepository<Habilidad, Long> {
    
}