package co.com.test.integ.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Mascota")
public class Mascotas {
    private String especie;
    private String raza;
    private String nombre;
    private String peso;
    private String edad;
    private String observaciones;
    private Propietario propietario;
}
