package co.com.test.integ.service;


import co.com.test.integ.app.ExcepcionNegocio;
import co.com.test.integ.domain.Usuario;
import co.com.test.integ.domain.UsuarioFactory;
import co.com.test.integ.repository.UsuarioRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;


import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

@Component
public class UsuarioServices implements UsuarioFactory {

    private UsuarioRepository usuarioRepository;

    UsuarioServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public BiFunction<String,String,Mono<Boolean>> login() {
        return (s, s2) -> {
         return    usuarioRepository.existsByUsuario(s)
                 .flatMap(aBoolean -> !aBoolean ?
                         Mono.error(new ExcepcionNegocio("Cuenta no encontrada")) :
                         usuarioRepository.findByUsuario(s))
                 .flatMap(u -> u.getEstado().booleanValue()?
                         Mono.error(new ExcepcionNegocio("Ya cuentas con una sesion iniciada")) :
                         usuarioRepository.findByUsuarioAndPassword(s,s2)
                                 .flatMap(usuario -> usuario.getUsuario() !=null ? Mono.just(true): Mono.just(false)));

        } ;
    }

    public Function<Usuario,Mono<Void>> crear() {
        return usuario -> crear(usuario).flatMap(usuarioRepository::save).then();
    }
}
