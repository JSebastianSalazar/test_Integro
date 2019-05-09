package co.com.test.integ.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Usuario")
public class Usuario {

    @Id
    private String id;
    private String usuario;
    private String password;
    private Date dateCreated;
    private Boolean estado;
}
