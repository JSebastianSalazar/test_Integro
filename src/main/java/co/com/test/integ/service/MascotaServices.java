package co.com.test.integ.service;

import co.com.test.integ.domain.Mascotas;
import co.com.test.integ.repository.MascotasRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class MascotaServices {

    private MascotasRepository mascotasRepository;

    MascotaServices(MascotasRepository mascotasRepository) {
        this.mascotasRepository  = mascotasRepository;
    }

    public Function<Mascotas, Mono<Void>> save() {
        return mascotas -> Mono.just(mascotas).flatMap(mascotasRepository::save).then();
    }

    public Function<String, Mono<Mascotas>> buscarMascotaXPropietario() {
        return s -> mascotasRepository.findByPropietario_NumeroIdentificacion(s);
    }
}
