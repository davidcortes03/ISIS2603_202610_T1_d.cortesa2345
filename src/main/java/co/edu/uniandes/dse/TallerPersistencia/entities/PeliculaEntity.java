package co.edu.uniandes.dse.TallerPersistencia.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class PeliculaEntity extends BaseEntity {
    private String titulo;
    private int anioLanzamiento;

    @ManyToOne
    DiretorEntity director;
}
