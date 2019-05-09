package co.com.test.integ.service;

import co.com.test.integ.domain.Citas;
import co.com.test.integ.domain.CitasFactory;
import co.com.test.integ.repository.CitasRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class CitasServices implements CitasFactory {

    private CitasRepository citasRepository;

    CitasServices(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }

    public Function<Citas, Mono<Void>> asignarCita() {
        return citas ->  agregarCita(citas).flatMap(citasRepository::save).then();
    }

   public  Function<Citas, Mono<Void>> reAsignarCita() {
        return citas ->  reAsignarCita(citas).flatMap(citasRepository::save).then();
    }


    public Function<Citas, Mono<Void>> cancelarCita() {
        return citas ->  cancelarCita(citas).flatMap(citasRepository::save).then();
    }


    public Function<Citas, Mono<Void>> enProceso() {
        return citas ->  enProceso(citas).flatMap(citasRepository::save).then();
    }


    public Flux<Citas> consultarCitas() {
        return citasRepository.findAll();
    }


    public Function<String, Flux<Citas>> consultarCitaXPaciente() {
        return s ->  citasRepository.findAllByMascotas_Propietario_NumeroIdentificacion(s);
    }

    public Function<String, Flux<Citas>> consultarCitasXMedico() {
        return s ->  citasRepository.findAllByNombreMedico(s);
    }



}
