
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUsuario", nullable = false, updatable = false)
    private Long idUsuario;
    @NotNull
    @Size(min = 1, max =50, message = "min 1, max 50 caracteres")
    @Column(name="nombreUsuario")
    private String nombreUsuario;
    @Size(min = 3, max =50, message = "min 3, max 50 caracteres")
    @Column(name="claveUsuario")
    private String claveUsuario;
    @Size(min = 5, max =20, message = "min 1, max 20 caracteres")
    @Column(name="permisoUsuario") 
    @Size(min = 1, max =20, message = "min 1, max 20 caracteres")
    private String permisoUsuario;
    
}
