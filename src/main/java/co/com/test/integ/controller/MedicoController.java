package co.com.test.integ.controller;

import co.com.test.integ.domain.Medico;
import co.com.test.integ.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_medico")
public class MedicoController {


    @Autowired(required = true)
    private MedicoService medicoController;

    @PostMapping("/guardar")
    public Mono<Void> guardar(@RequestBody Medico medico) {
        return  medicoController.save().apply(medico);
    }

    @GetMapping("/borrar/{numeroDocumento}")
    public Mono<Void> eliminar(@PathVariable String numeroDocumento) {
        return  medicoController.eliminar().apply(numeroDocumento);
    }

    @GetMapping("/activar/{numeroDocumento}")
    public Mono<Void> activar(@PathVariable String numeroDocumento) {
        return  medicoController.activar().apply(numeroDocumento);
    }

    @GetMapping("/buscar/{numeroDocumento}")
    public Mono<Medico> buscarMedico(@PathVariable String numeroDocumento) {
        return  medicoController.buscarMedico().apply(numeroDocumento);
    }
}
