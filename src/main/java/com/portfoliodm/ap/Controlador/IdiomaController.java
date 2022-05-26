package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Idioma;
import com.portfoliodm.ap.Interface.IIdiomaService;
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
@RequestMapping("/idioma")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin

public class IdiomaController {
    @Autowired IIdiomaService iidiomaservice;
    
    @GetMapping("/traer")
    public List<Idioma> getIdioma() {
        return iidiomaservice.getIdioma();
    
    }
    
    @PostMapping("/crear")
    public void crearIdioma(@RequestBody Idioma idioma){
        iidiomaservice.saveIdioma(idioma);
        
    
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteIdioma(@PathVariable Long id) {
        iidiomaservice.deleteIdioma(id);
        
    }
    
	
	
	
	
	
    @PutMapping("/edit")
    public void editIdioma(@RequestBody Idioma idioma){
        iidiomaservice.saveIdioma(idioma);
    }
    
    
    @GetMapping("/ver/{Id}")
    public Idioma verIdioma(@PathVariable Long Id) {
        Idioma idioma = iidiomaservice.findIdioma(Id);
        return idioma;
    }
                               
                                
}
