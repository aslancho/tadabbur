package app.tadabbur.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WordDTO {
    private final String arabicText;

    private final String translation;

    private final String ayatArabicText;
    private final Integer suraNumber;
    private final Integer ayatNumber;
    private final String suraName;
}