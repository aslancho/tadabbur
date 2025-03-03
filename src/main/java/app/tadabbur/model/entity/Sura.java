package app.tadabbur.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SURAS")
@Getter @Setter
@NoArgsConstructor
public class Sura {
    @Id
    private Integer number; // номер суры от 1 до 114 как Primary Key
    private String name;
    private String arabicName;

    @OneToMany(mappedBy = "sura")
    private List<Ayat> ayats;
}
