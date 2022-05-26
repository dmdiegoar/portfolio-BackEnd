package com.portfoliodm.ap.Controlador;

import com.portfoliodm.ap.Entidad.Educacion;
import com.portfoliodm.ap.Interface.IEducacionService;
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
@RequestMapping("/educacion")
///@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "*")
@CrossOrigin


public class EducacionController {
    @Autowired IEducacionService ieducacionservice;
    
    @GetMapping("/traer")
    public List<Educacion> getEducacion() {
        return ieducacionservice.getEducacion();
    
    }
    
    @PostMapping("/crear")
    //public String crearEducacion(@RequestBody Educacion educacion){
    public void crearEducacion(@RequestBody Educacion educacion){
        ieducacionservice.saveEducacion(educacion);
        //return "{"clave": "La educacion fue creada correctamente"}";
        //return "La educacion fue creada correctamente";
     }
    
    @DeleteMapping("/borrar/{id}")
    public void  deleteEducacion(@PathVariable Long id) {
        ieducacionservice.deleteEducacion(id);
        //return "La educacion fue eliminada correctamente";
    }
    
    
    
    @PutMapping("/edit")
    //public String crearEducacion(@RequestBody Educacion educacion){
    public void editEducacion(@RequestBody Educacion educacion){
        ieducacionservice.saveEducacion(educacion);
        //return "{"clave": "La educacion fue creada correctamente"}";
        //return "La educacion fue creada correctamente";
     }
    
    
    
    
    @GetMapping("/ver/{Id}")
    public Educacion verEducacion(@PathVariable Long Id) {
        Educacion educacion = ieducacionservice.findEducacion(Id);
        return educacion;
    }
                               
                                
}
