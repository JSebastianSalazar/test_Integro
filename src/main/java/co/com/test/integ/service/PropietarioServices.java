package co.com.test.integ.service;

import co.com.test.integ.domain.Medico;
import co.com.test.integ.domain.Propietario;
import co.com.test.integ.repository.PropietariosRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class PropietarioServices  {

    private PropietariosRepository propietariosRepository;

    PropietarioServices(PropietariosRepository propietariosRepository) {
        this.propietariosRepository = propietariosRepository;
    }


    public Function<Propietario, Mono<Void>> save() {
        return propietario -> Mono.just(propietario).flatMap(propietariosRepository::save).then();
    }

    public Function<String ,Mono<Propietario>>  buscarPropietario() {
        return s -> propietariosRepository.findByNumeroIdentificacion(s);
    }




}
