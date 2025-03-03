package app.tadabbur.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "words")
@Getter @Setter
@NoArgsConstructor
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String arabicText;
    private String translation;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "sura_number", referencedColumnName = "sura_number"),
            @JoinColumn(name = "ayat_number", referencedColumnName = "ayat_number")
    })
    private Ayat ayat;
}
