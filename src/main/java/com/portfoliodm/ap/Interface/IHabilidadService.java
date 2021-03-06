
package com.portfoliodm.ap.Interface;

import com.portfoliodm.ap.Entidad.Habilidad;
import java.util.List;

public interface IHabilidadService {
    
    public List<Habilidad> getHabilidad();
    
    public void saveHabilidad(Habilidad habilidad);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad findHabilidad(Long id);
    
}
