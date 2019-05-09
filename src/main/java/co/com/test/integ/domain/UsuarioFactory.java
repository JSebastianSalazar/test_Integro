package co.com.test.integ.domain;

import reactor.core.publisher.Mono;

import java.util.Date;

public interface UsuarioFactory {

    default Mono<Usuario> crear(Usuario usuario){
        return Mono.just(Usuario.builder()
                .estado(false)
                .dateCreated(new Date())
                .usuario(usuario.getUsuario())
                .password(usuario.getPassword())
                .build());
    }

    default Usuario usuarioLogeado(Usuario usuario) {
         return usuario.toBuilder().estado(true).build();
    }
}
