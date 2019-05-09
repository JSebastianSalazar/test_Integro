package co.com.test.integ.service;

import co.com.test.integ.domain.Medico;
import co.com.test.integ.domain.MedicoFactory;
import co.com.test.integ.repository.MedicoRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class MedicoService implements MedicoFactory {

    private MedicoRepository medicoRepository;

     MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }


    public Function<Medico, Mono<Void>> save() {
         return medico -> guardar(medico).flatMap(medicoRepository::save).then();
    }


    public Function<String, Mono<Void>> eliminar() {
         return numeroDocumento -> medicoRepository
                 .findByNumeroIdentificacion(numeroDocumento)
                 .flatMap(medico1 -> eliminar(medico1))
                 .flatMap(medico ->  medicoRepository.save(medico))
                 .then();
    }

    public Function<String, Mono<Void>> activar() {
        return numeroDocumento -> medicoRepository
                .findByNumeroIdentificacion(numeroDocumento)
                .flatMap(medico1 -> activar(medico1))
                .flatMap(medico ->  medicoRepository.save(medico))
                .then();
    }

    public Function<String, Mono<Medico>> buscarMedico() {
         return s ->  medicoRepository.findByNumeroIdentificacion(s);
    }


}
