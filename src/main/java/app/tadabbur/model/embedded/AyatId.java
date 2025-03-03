package app.tadabbur.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AyatId implements Serializable {
    private Integer suraNumber;
    private Integer ayatNumber; // номер аята в рамках суры
}