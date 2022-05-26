
package com.portfoliodm.ap.Interface;
        
import com.portfoliodm.ap.Entidad.Usuario;
import java.util.List;



public interface Login {
    

    
    public List<Usuario> getUsuario();
    
    public void saveUsuario(Usuario usuario);
    
    public void deleteUsuario(Long id);
    
    public Usuario findUsuario(Long id);
    
}
