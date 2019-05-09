package co.com.test.integ.repository;


import co.com.test.integ.domain.Propietario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PropietariosRepository extends ReactiveCrudRepository<Propietario, String> {

    Mono<Propietario> findByNumeroIdentificacion(String  numeroDocumento);
}
