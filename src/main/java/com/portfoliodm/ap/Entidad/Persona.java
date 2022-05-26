
package com.portfoliodm.ap.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @NotNull
    @Size(min = 1, max =50, message = "min 1, max 50 caracteres")
    private String nombre;
    @Size(min = 1, max =50, message = "min 1, max 50 caracteres")
    private String titulo;
    @Size(min = 1, max =200, message = "min 1, max 200 caracteres")
    private String direccion;
    @Size(min = 1, max =2000, message = "min 1, max 2000 caracteres")
    private String sobremi;
    
    @Size(min = 1, max =300, message = "min 1, max 300 caracteres")
    private String fotoPerfil;
    
}
