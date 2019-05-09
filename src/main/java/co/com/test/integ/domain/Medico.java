package co.com.test.integ.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Medico")
public class Medico {

    @Id
    private String id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String numeroIdentificacion;
    private Date fechaNacimiento;
    private String estado;
}
