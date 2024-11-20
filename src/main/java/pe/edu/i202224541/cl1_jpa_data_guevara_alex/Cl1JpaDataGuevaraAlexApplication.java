package pe.edu.i202224541.cl1_jpa_data_guevara_alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity.Country;
import pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity.CountryLanguage;
import pe.edu.i202224541.cl1_jpa_data_guevara_alex.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataGuevaraAlexApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataGuevaraAlexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


//		Optional<Country> countryOpt = countryRepository.findById("ARG");
//
//		countryOpt.ifPresentOrElse(
//				(item) -> {
//					// Imprimir los lenguajes de ARG
//					System.out.println("Languages spoken in ARG:");
//					item.getCountryLanguages().forEach(language -> {
//						System.out.println(language.getLanguage());
//					});
//				},
//				() -> {
//					// Si el país no existe, imprimimos los lenguajes de PER
//					System.out.println("Country not found, checking for PER...");
//
//					Optional<Country> peruOpt = countryRepository.findById("PER");
//					peruOpt.ifPresent(peru -> {
//						// Imprimir los lenguajes de PER
//						System.out.println("Languages spoken in PER:");
//						peru.getCountryLanguages().forEach(language -> {
//							System.out.println(language.getLanguage());
//						});
//					});
//				}
//		);


		// Verificar si los países "COL" y "ARG" existen antes de eliminarlos
		if (countryRepository.existsById("COL") && countryRepository.existsById("ARG")) {
			// Eliminar los países por su ID (en este caso, el código del país)
			countryRepository.deleteAllById(List.of("COL", "ARG"));
			System.out.println("Los países COL y ARG han sido eliminados junto con sus ciudades y lenguajes relacionados.");
		} else {
			System.out.println(" countries not found.");
		}

		// Ahora volvemos a ejecutar la primera consulta
		Optional<Country> countryOpt = countryRepository.findById("ARG");

		countryOpt.ifPresentOrElse(
				(item) -> {
					System.out.println(String.format("Country is %s", item.getCountryLanguages()));
				},
				() -> {
					// Si "ARG" no se encuentra, verificamos "PER"
					System.out.println("Country not found, checking for PER...");
					Optional<Country> peruOpt = countryRepository.findById("PER");
					peruOpt.ifPresent(peru -> {
						peru.getCountryLanguages().forEach(language -> {
							System.out.println(language.getLanguage());
						});
					});
				}
		);


	}
	}
