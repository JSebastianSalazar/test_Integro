package co.com.test.integ.repository;

import co.com.test.integ.domain.Mascotas;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface MascotasRepository  extends ReactiveCrudRepository<Mascotas, String> {

    Mono<Mascotas> findByPropietario_NumeroIdentificacion(String numeroDocumento);
}
