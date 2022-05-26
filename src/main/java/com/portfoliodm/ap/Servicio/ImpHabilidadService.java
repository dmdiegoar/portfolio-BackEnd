package com.portfoliodm.ap.Servicio;

import com.portfoliodm.ap.Entidad.Habilidad;
import com.portfoliodm.ap.Interface.IHabilidadService;
import com.portfoliodm.ap.Repositorio.IhabilidadRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidadService implements IHabilidadService {
    @Autowired IhabilidadRepo ihabilidadRepository;

    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> habilidad = ihabilidadRepository.findAll();
        return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        ihabilidadRepository.save(habilidad);
        
    }

    @Override
    public void deleteHabilidad(Long id) {
        ihabilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habilidad = ihabilidadRepository.findById(id).orElse(null);
        return habilidad;
    }
    
}
