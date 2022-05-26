
package com.portfoliodm.ap.Interface;

import com.portfoliodm.ap.Entidad.Idioma;
import java.util.List;

public interface IIdiomaService {
    
    public List<Idioma> getIdioma();
    
    public void saveIdioma(Idioma idioma);
    
    public void deleteIdioma(Long id);
    
    public Idioma findIdioma(Long id);
    
}
