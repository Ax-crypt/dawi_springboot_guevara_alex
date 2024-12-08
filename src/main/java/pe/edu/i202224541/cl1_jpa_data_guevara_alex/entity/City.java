package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iD;
    private String name;
    private String district;
    private int population;
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;

}
