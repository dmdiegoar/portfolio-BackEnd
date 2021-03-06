package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Persona;
import com.portfoliodm.ap.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/personas")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin

public class PersonaController {
    @Autowired IPersonaService ipersonaservice;
    
    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaservice.getPersona();
    
    }
    
    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        return "La persona fue creada correctamente";
    
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaservice.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

@PutMapping("/editar")
    
    public void editPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        
     }






    

    
    
    @GetMapping("/ver/{Id}")
    public Persona verPersona(@PathVariable Long Id) {
        Persona persona = ipersonaservice.findPersona(Id);
        return persona;
    }
                               
                                
}
