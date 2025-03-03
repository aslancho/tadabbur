package app.tadabbur.model.dto;

import app.tadabbur.model.embedded.AyatId;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WordDTO {
    private final String arabicText;

    private final String translation;

    private final String ayatArabicText;
    private final AyatId ayatId;
    private final String suraName;
}