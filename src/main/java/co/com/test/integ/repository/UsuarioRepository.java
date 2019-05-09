package co.com.test.integ.repository;

import co.com.test.integ.domain.Usuario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, String> {
    Mono<Usuario> findByUsuarioAndPassword(String usuario, String Password);
    Mono<Usuario>findByUsuario(String usuario);
    Mono<Boolean> existsByUsuario(String usuario);

}
