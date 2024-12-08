package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countrylanguage")
public class CountryLanguage {
   @EmbeddedId
   private CountryLanguageId countryLanguageId;
    @Column(name = "isOfficial", columnDefinition = "enum('T', 'F')")
    @Enumerated(EnumType.STRING)
    private OfficialStatus isOfficial;
    private double Percentage;
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    @MapsId("countryCode")
    private Country country;
    public enum OfficialStatus {
        T, F
    }
}
