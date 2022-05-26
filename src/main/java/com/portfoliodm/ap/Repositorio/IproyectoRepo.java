package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproyectoRepo extends JpaRepository<Proyecto, Long> {
    
}
