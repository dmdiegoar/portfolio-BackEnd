
package com.portfoliodm.ap.Servicio;

import com.portfoliodm.ap.Entidad.Usuario;
import com.portfoliodm.ap.Interface.Login;
import com.portfoliodm.ap.Repositorio.LoginRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ImpLogin implements Login {
    
    @Autowired LoginRepo loginrepo;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = loginrepo.findAll();
        return usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
       loginrepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        loginrepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = loginrepo.findById(id).orElse(null);
        return usuario;
    }
    
    
    public Usuario findByNombreUsuario(String nombreUsuario) {
        Usuario usuario = loginrepo.findByNombreUsuario(nombreUsuario);
        return usuario;
    
    }
    
    public Usuario findByNombreUsuarioAndClaveUsuario(String nombreUsuario,String claveUsuario) {
    Usuario usuario = loginrepo.findByNombreUsuarioAndClaveUsuario(nombreUsuario, claveUsuario);
        return usuario;
    
    
    }
    
    
    
    
    
    
    
    
    
   
    
  
}
