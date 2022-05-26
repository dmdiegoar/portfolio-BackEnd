package com.portfoliodm.ap.Servicio;

import com.portfoliodm.ap.Entidad.Idioma;
import com.portfoliodm.ap.Interface.IIdiomaService;
import com.portfoliodm.ap.Repositorio.IidiomaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpIdiomaService implements IIdiomaService {
    @Autowired IidiomaRepo iidiomaRepository;

    @Override
    public List<Idioma> getIdioma() {
        List<Idioma> idioma = iidiomaRepository.findAll();
        return idioma;
    }

    @Override
    public void saveIdioma(Idioma idioma) {
        iidiomaRepository.save(idioma);
        
    }

    @Override
    public void deleteIdioma(Long id) {
        iidiomaRepository.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
        Idioma idioma = iidiomaRepository.findById(id).orElse(null);
        return idioma;
    }
    
}

