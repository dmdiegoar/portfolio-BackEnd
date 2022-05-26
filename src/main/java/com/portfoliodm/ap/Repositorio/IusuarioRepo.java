package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Usuario;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diego
 */
@Primary
@Repository
public interface IusuarioRepo extends CrudRepository<Usuario, Long>{
    
    Usuario findByNombreUsuario(String nombreUsuario);
    Usuario findByNombreUsuarioAndClaveUsuario(String nombreUsuario,String claveUsuario); 
    
    
    
}