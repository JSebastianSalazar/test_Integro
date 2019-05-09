package co.com.test.integ.domain;

import reactor.core.publisher.Mono;

public interface CitasFactory {

    default Mono<Citas> agregarCita(Citas citas) {
        return Mono.just(Citas
                .builder()
                .Descripcion(citas.getDescripcion())
                .estadoCita(EstadoCitaEnum.ASIGNADA.name())
                .fechaFinal(citas.getFechaFinal())
                .mascotas(citas.getMascotas())
                .nombreMedico(citas.getNombreMedico())
                .fechaInicial(citas.getFechaInicial())
                .build());
    }

    default Mono<Citas> enProceso(Citas citas) {
        return Mono.just(citas
                .toBuilder()
                .estadoCita(EstadoCitaEnum.ENPROCESO.name())
                .build());
    }

    default Mono<Citas> cancelarCita(Citas citas) {
        return Mono.just(citas
                .toBuilder()
                .estadoCita(EstadoCitaEnum.CANCELADA.name())
                .build());
    }

    default Mono<Citas> reAsignarCita(Citas citas) {
        return Mono.just(citas
                .toBuilder()
                .estadoCita(EstadoCitaEnum.REASIGNADA.name())
                .build());
    }
}
