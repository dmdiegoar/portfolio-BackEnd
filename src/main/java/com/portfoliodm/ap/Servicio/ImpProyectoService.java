package com.portfoliodm.ap.Servicio;

import com.portfoliodm.ap.Entidad.Proyecto;
import com.portfoliodm.ap.Interface.IProyectoService;
import com.portfoliodm.ap.Repositorio.IproyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
    @Autowired IproyectoRepo iproyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iproyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
        
    }

    @Override
    public void deleteProyecto(Long id) {
        iproyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = iproyectoRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}

