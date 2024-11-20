package pe.edu.i202224541.cl1_jpa_data_guevara_alex.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
