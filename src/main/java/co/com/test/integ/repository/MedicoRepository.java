package co.com.test.integ.repository;


import co.com.test.integ.domain.Medico;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface MedicoRepository extends ReactiveCrudRepository<Medico, String> {

    Mono<Medico> findByNumeroIdentificacion(String numeroDocumento);
}
