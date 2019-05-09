package co.com.test.integ.repository;

import co.com.test.integ.domain.Citas;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CitasRepository extends ReactiveCrudRepository<Citas, String> {
    @Query("{'propietario.numeroIdentificacion': ?0 }")
    Flux<Citas> findAllByMascotas_Propietario_NumeroIdentificacion(String numeroDocumento);
    Flux<Citas>findAllByNombreMedico(String nombreMedico);
}
