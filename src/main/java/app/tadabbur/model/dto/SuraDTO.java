package app.tadabbur.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SuraDTO {
    private final Integer number;
    private final String name;
}
