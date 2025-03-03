package app.tadabbur.service;

import app.tadabbur.model.entity.Ayat;
import app.tadabbur.repository.AyatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AyatService {
    private final AyatRepository ayatRepository;

    public List<Ayat> getAyatsBySuraNumber(Integer suraNumber) {
        return ayatRepository.findBySuraNumber(suraNumber);
    }

    public Optional<Ayat> getAyatBySuraAndAyatNumber(Integer suraNumber, Integer ayatNumber) {
        return ayatRepository.findBySuraNumberAndAyatNumber(suraNumber, ayatNumber);
    }
}