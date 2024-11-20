package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "countrylanguage")
public class CountryLanguage {
    @Id
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;
    @Id
    private String Language;
    private double Percentage;
    @Column(name = "IsOfficial", columnDefinition = "enum('T', 'F')")
    @Enumerated(EnumType.STRING)
    private OfficialStatus isOfficial;

    public enum OfficialStatus {
        T, F
    }
}
