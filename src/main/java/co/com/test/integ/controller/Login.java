package co.com.test.integ.controller;

import co.com.test.integ.domain.LoginRequest;
import co.com.test.integ.domain.Usuario;
import co.com.test.integ.service.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(value = "*")
public class Login {

    @Autowired(required = true)
    private UsuarioServices usuarioServices;

    @PostMapping("/login")
    public Mono<Boolean> login(@RequestBody LoginRequest usuario) {
        return usuarioServices.login().apply(usuario.getUsuario(),usuario.getPassword());
    }

    @PostMapping("/crear")
    public Mono<Void> crear(@RequestBody Usuario usuario) {
        return usuarioServices.crear().apply(usuario);
    }
}
