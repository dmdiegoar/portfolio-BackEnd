
package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Usuario;
import com.portfoliodm.ap.Interface.Login;
import com.portfoliodm.ap.Repositorio.LoginRepo;
import com.portfoliodm.ap.Servicio.ImpLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/login")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin
public class LoginController {
    
    
    
    @Autowired ImpLogin implogin;
    
     @GetMapping("/traer")
    public List<Usuario> getUsuario() {
        return implogin.getUsuario();
    
    }
    
    @GetMapping("/{id}")
    @ResponseBody
    public Usuario usuario(@PathVariable Long id){
        return(implogin.findUsuario(id));
    }
    
    @GetMapping("/username/")
    @ResponseBody
    public Usuario usuario(){
        return(implogin.findByNombreUsuario("dmdiegoar"));
                
    }
    
    
    @PostMapping("/api")
    @ResponseBody
    public Usuario login(@RequestBody Usuario u){
        return(implogin.findByNombreUsuarioAndClaveUsuario(u.getNombreUsuario(),u.getClaveUsuario()));
    }
    
    
    
}
