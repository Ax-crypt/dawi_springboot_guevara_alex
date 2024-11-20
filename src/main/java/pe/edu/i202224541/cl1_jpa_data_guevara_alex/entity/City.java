package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Name;
    private String District;
    private int Population;
    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;

}
