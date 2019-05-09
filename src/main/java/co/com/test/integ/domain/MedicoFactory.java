package co.com.test.integ.domain;

import reactor.core.publisher.Mono;

public interface MedicoFactory {

    default Mono<Medico> guardar(Medico medico){
        return Mono.just(Medico.builder()
                .nombre(medico.getNombre())
                .apellido1(medico.getApellido1())
                .fechaNacimiento(medico.getFechaNacimiento())
                .numeroIdentificacion(medico.getNumeroIdentificacion())
                .estado(EstadoMedicoEnum.ACTIVO.toString())
                .build());
    }

    default Mono<Medico> eliminar(Medico medico){
        return Mono.just(medico.toBuilder().estado(EstadoMedicoEnum.INACTIVO.toString()).build());
    }

    default Mono<Medico> activar(Medico medico) {
        return Mono.just(medico.toBuilder().estado(EstadoMedicoEnum.ACTIVO.toString()).build());
    }


}
