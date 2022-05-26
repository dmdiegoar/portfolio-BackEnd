package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IeducacionRepo extends JpaRepository<Educacion, Long> {
    
}
