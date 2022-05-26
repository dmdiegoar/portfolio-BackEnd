package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Habilidad;
import com.portfoliodm.ap.Interface.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidad")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin
public class HabilidadController {
    @Autowired IHabilidadService ihabilidadservice;
    
    @GetMapping("/traer")
    public List<Habilidad> getHabilidad() {
        return ihabilidadservice.getHabilidad();
    
    }
    
    @PostMapping("/crear")
    public void crearHabilidad(@RequestBody Habilidad habilidad){
        ihabilidadservice.saveHabilidad(habilidad);
           
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteHabilidad(@PathVariable Long id) {
        ihabilidadservice.deleteHabilidad(id);
        
    }
	
	    
    @PutMapping("/edit")
    public void editHabilidad(@RequestBody Habilidad habilidad){
        ihabilidadservice.saveHabilidad(habilidad);
           
    }
    
    
    @GetMapping("/ver/{Id}")
    public Habilidad verHabilidad(@PathVariable Long Id) {
        Habilidad habilidad = ihabilidadservice.findHabilidad(Id);
        return habilidad;
    }
                               
                                
}
