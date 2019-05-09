package co.com.test.integ.controller;



import co.com.test.integ.domain.Propietario;
import co.com.test.integ.service.PropietarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_propietario")
public class PropietarioController {


    @Autowired
    private PropietarioServices propietarioServices;

    @PostMapping("/guardar")
    public Mono<Void> guardar(@RequestBody Propietario propietario) {
        return  propietarioServices.save().apply(propietario);
    }

    @GetMapping("/buscarPropietario{numeroIdentificacion}")
    public Mono<Propietario> buscarPropietario(@PathVariable String numeroDocumento) {
        return propietarioServices.buscarPropietario().apply(numeroDocumento);
    }


}
