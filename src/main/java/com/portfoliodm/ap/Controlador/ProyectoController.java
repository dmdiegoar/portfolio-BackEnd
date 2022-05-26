package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Proyecto;
import com.portfoliodm.ap.Interface.IProyectoService;
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
@RequestMapping("/proyecto")
//@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin

public class ProyectoController {
    @Autowired IProyectoService iproyectoservice;
    
    @GetMapping("/traer")
    public List<Proyecto> getProyecto() {
        return iproyectoservice.getProyecto();
    
    }
    
    @PostMapping("/crear")
    public void crearProyecto(@RequestBody Proyecto proyecto){
        iproyectoservice.saveProyecto(proyecto);
        
    
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteProyecto(@PathVariable Long id) {
        iproyectoservice.deleteProyecto(id);
        
    }
	
	
    
    @PutMapping("/edit")
    public void editProyecto(@RequestBody Proyecto proyecto){
        iproyectoservice.saveProyecto(proyecto);
    }
    
    
    @GetMapping("/ver/{Id}")
    public Proyecto verProyecto(@PathVariable Long Id) {
        Proyecto proyecto = iproyectoservice.findProyecto(Id);
        return proyecto;
    }
    

}