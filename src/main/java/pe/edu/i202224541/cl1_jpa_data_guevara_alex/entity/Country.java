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
    @Column(name = "Code", length = 3)
    private String code;

    @Column(name = "Name", length = 52)
    private String name;

    @Column(name = "Continent", length = 13)
    private String continent;

    @Column(name = "Region", length = 26)
    private String region;

    @Column(name = "SurfaceArea")
    private double surfaceArea;

    @Column(name = "IndepYear")
    private Integer independenceYear;

    @Column(name = "Population")
    private int population;

    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNPOld")
    private Double gnpOld;

    @Column(name = "LocalName", length = 45)
    private String localName;

    private String gobermentform;

    private String HeadOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2", length = 2)
    private String code2;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

    @OneToMany(mappedBy = "country")
    private List<CountryLanguage> countryLanguages;

}
