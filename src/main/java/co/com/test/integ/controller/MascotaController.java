package co.com.test.integ.controller;

import co.com.test.integ.domain.Mascotas;
import co.com.test.integ.service.MascotaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_mascota")
public class MascotaController {


    @Autowired(required = true)
    private MascotaServices mascotaServices;

    @PostMapping("/guardar")
    public Mono<Void> guardar(@RequestBody Mascotas mascotas) {
        return  mascotaServices.save().apply(mascotas);
    }


    @GetMapping("/buscarMascota/{numeroDocumento}")
    public  Mono<Mascotas> buscarMascotaXPropietario(@PathVariable String  numeroDocumento) {
        return  mascotaServices.buscarMascotaXPropietario().apply(numeroDocumento);
    }
}
