package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="country")
public class Country {
    @Id
    private String Code;
    private String Name;
    @Column(name = "Continent", columnDefinition = "enum('Asia', 'Europe','North America', 'Africa', 'Oceania','Antarctica','South America')")
    @Enumerated(EnumType.STRING)
    private Continent continent;
    private String Region;
    private double surface_area;
    private Integer indep_year;
    private int Population;
    private Double life_expectancy;
    private Double GNP;
    private Double GNPOld;
    private String local_name;
    private String government_form;
    private String head_of_state;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

    @OneToMany(mappedBy = "country")
    private List<CountryLanguage> countryLanguages;

 public enum Continent {
    ASIA, EUROPE,NORTH_AMERICA,AFRICA,OCEANIA,ANTARCTICA,SOUTH_AMERICA
 }
}
