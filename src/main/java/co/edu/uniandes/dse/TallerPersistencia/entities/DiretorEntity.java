package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DiretorEntity extends BaseEntity{
    private String nombre;
    private String biografia;

    @OneToMany (mappedBy = "director")
    List<PeliculaEntity> peliculas;

}
