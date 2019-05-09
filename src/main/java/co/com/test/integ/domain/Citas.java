package co.com.test.integ.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Cita")
public class Citas {
    @Id
    private String id;
    private Mascotas mascotas;
    private Date fechaInicial;
    private Date fechaFinal;
    private String nombreMedico;
    private String Descripcion;
    private String estadoCita;

}
