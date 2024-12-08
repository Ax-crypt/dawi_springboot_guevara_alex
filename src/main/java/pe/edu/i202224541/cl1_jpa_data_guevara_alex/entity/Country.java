package pe.edu.i202224541.cl1_jpa_data_guevara_alex.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="country")
public class Country {
    @Id
    private String Code;
    private String Name;
    @Column(name = "Continent", columnDefinition = "enum('Asia', 'Europe','North America', 'Africa', 'Oceania','Antarctica','South America')")
    @Enumerated(EnumType.STRING)
    private Continent continent;
    private String Region;
    private double surfaceArea;
    private Integer indepYear;
    private int Population;
    private Double lifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;

 public enum Continent {
    ASIA, EUROPE,NORTH_AMERICA,AFRICA,OCEANIA,ANTARCTICA,SOUTH_AMERICA
 }
}
