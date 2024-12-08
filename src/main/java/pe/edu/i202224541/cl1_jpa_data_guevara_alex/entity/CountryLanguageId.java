package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguageId {
private String countryCode ;
private String language ;
}
