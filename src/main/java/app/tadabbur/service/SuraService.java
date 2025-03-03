package app.tadabbur.service;

import app.tadabbur.model.dto.SuraDTO;
import app.tadabbur.model.entity.Sura;
import app.tadabbur.repository.SuraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SuraService {

    private final SuraRepository suraRepository;

    public List<SuraDTO> getAllSuras() {
        return suraRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private SuraDTO toDTO(Sura sura) {
        return SuraDTO.builder()
                .name(sura.getName())
                .number(sura.getNumber())
                .build();
    }
}