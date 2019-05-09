package co.com.test.integ.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Raza")
public class Razas {
    @Id
    private String id;
    private String nombre;
    private String especie;
    private String valor;
}
