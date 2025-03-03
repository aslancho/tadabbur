package app.tadabbur.model.entity;

import app.tadabbur.model.embedded.AyatId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ayats")
@Getter @Setter
@NoArgsConstructor
public class Ayat {
    @EmbeddedId
    private AyatId id; // составной ключ из номера суры и номера аята

    @ManyToOne
    @MapsId("suraNumber")
    @JoinColumn(name = "sura_number")
    private Sura sura;

    @OneToMany(mappedBy = "ayat")
    private List<Word> words;
}
