
package com.portfoliodm.ap.Repositorio;

import com.portfoliodm.ap.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface LoginRepo extends JpaRepository<Usuario, Long>,   CrudRepository<Usuario, Long> {
    
    public Usuario findByNombreUsuario(String nombreUsuario);
    public Usuario findByNombreUsuarioAndClaveUsuario(String nombreUsuario,String claveUsuario); 
    
    
    
   
    
}
