package co.com.test.integ.app;

import co.com.test.integ.controller.MedicoController;
import co.com.test.integ.domain.EstadoMedicoEnum;
import co.com.test.integ.domain.Medico;
import co.com.test.integ.repository.MedicoRepository;
import co.com.test.integ.service.MedicoService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import reactor.core.publisher.Mono;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class MesdicoControllerTest {

    @InjectMocks
    private MedicoController medicoController;

    @Mock
    private MedicoService medicoService;

    @Mock
    private Medico medico;



    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGuardar() {
       /* Medico medico = Medico.builder().estado(EstadoMedicoEnum.ACTIVO.toString()).numeroIdentificacion("100222")
                .fechaNacimiento(new Date()).id("11212").nombre("Juli").apellido1("Jaramillo").apellido2("Lopez").build();
        Medico medico2 = Medico.builder().estado(EstadoMedicoEnum.ACTIVO.toString()).numeroIdentificacion("100222")
                .fechaNacimiento(new Date()).id("2323").nombre("Juli").apellido1("Jaramillo").apellido2("Lopez").build();

        final Mono<Void> expectedResult = Mono.just("").then();
        Mockito.when(medicoService.save().apply(medico)).thenReturn(Mono.empty());
        final Mono<Void> result = medicoController.guardar(medico2);

        assertThat(result.block()).isEqualTo(expectedResult.block());*/
    }

}

