package co.com.test.integ.repository;

import co.com.test.integ.domain.Mascotas;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Razas extends ReactiveCrudRepository<Mascotas, String> {
}
