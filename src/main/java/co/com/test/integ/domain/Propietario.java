package co.com.test.integ.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Propietario")
public class Propietario {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
}
