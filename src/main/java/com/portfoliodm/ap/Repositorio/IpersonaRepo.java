package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpersonaRepo extends JpaRepository<Persona, Long> {
    
}
