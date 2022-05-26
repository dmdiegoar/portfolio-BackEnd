package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Usuario;

import com.portfoliodm.ap.Repositorio.IusuarioRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/usuario")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin

public class UsuarioController {
  
    
    @Autowired
    private IusuarioRepo IusuarioRepo;
    
    @GetMapping("/id/{id}")
    @ResponseBody
    public Usuario usuario(@PathVariable Long id){
        return(IusuarioRepo.findById(id).get());
    }
    
    @GetMapping("/username/")
    @ResponseBody
    public Usuario usuario(){
        return(IusuarioRepo.findByNombreUsuario("dmdiegoar"));
    }
    
    @PostMapping("/login")
    @ResponseBody
    public Usuario login(@RequestBody Usuario u){
        return(IusuarioRepo.findByNombreUsuarioAndClaveUsuario(u.getNombreUsuario(),u.getClaveUsuario()));
    }
    
    @PostMapping("/crear")
    public void newUser(@RequestBody Usuario u){
        IusuarioRepo.save(u);
    }
    
    @PutMapping("/edit")
    public void editUser(@RequestBody Usuario u){
        IusuarioRepo.save(u);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        IusuarioRepo.deleteById(id);
    }
    
    
    
                  
                                
}
