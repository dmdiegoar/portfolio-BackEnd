
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
public class Idioma {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIdioma;
	
	@NotNull
    @Size(min = 1, max =100, message = "min 1, max 100 caracteres")
    private String idioma;
	
	@Size(min = 1, max =50, message = "min 1, max 50 caracteres")
    private String nivelIdioma;
	
}