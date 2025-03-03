package app.tadabbur.service;

import app.tadabbur.model.dto.WordDTO;
import app.tadabbur.model.entity.Word;
import app.tadabbur.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

    public List<WordDTO> getWordsFromSuras(List<Integer> suraNumbers) {
        List<WordDTO> words = wordRepository.findBySuraNumberIn(suraNumbers).stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
        // Перемешиваем слова в случайном порядке для тестирования
        Collections.shuffle(words);
        return words;
    }

    private WordDTO toDTO(Word word) {
        return WordDTO.builder()
                .arabicText(word.getArabicText())
                .translation(word.getTranslation())

                .ayatArabicText(word.getAyat().getAyatArabicText())
                .suraName(word.getAyat().getSura().getName())
                .ayatId(word.getAyat().getId())
                .build();
    }
}