package co.com.test.integ.controller;

import co.com.test.integ.domain.Citas;
import co.com.test.integ.service.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_citas")
public class CitaController {

    @Autowired(required = true)
    private CitasServices citasServices;


    @PostMapping("/asignarCita")
    public Mono<Void> asignarCita(@RequestBody Citas citas){
        return citasServices.asignarCita().apply(citas);
    }

    @PostMapping("/reAsignarCita")
    public Mono<Void> reAsignarCita(@RequestBody Citas citas){
        return citasServices.reAsignarCita().apply(citas);
    }

    @PostMapping("/cancelarCita")
    public Mono<Void> cancelarCita(@RequestBody Citas citas){
        return citasServices.cancelarCita().apply(citas);
    }

    @PostMapping("/enProceso")
    public Mono<Void> enProceso(@RequestBody Citas citas){
        return citasServices.enProceso().apply(citas);
    }

    @GetMapping("/consultarCitas")
    public Flux<Citas> consultarCitas(){
        return citasServices.consultarCitas();
    }

    @GetMapping("/consultarCitaXPaciente/{numeroDocumento}")
    public Flux<Citas> consultarCitaXPaciente(@PathVariable  String numeroDocumento ){
        return citasServices.consultarCitaXPaciente().apply(numeroDocumento);
    }

    @GetMapping("/consultarCitasXMedico/{numeroDocumento}")
    public Flux<Citas> consultarCitasXMedico(@PathVariable  String numeroDocumento ){
        return citasServices.consultarCitasXMedico().apply(numeroDocumento);
    }










}
