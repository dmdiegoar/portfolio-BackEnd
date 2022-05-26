package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IidiomaRepo extends JpaRepository<Idioma, Long> {
    
}