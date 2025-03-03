package app.tadabbur.service;

import app.tadabbur.model.entity.Word;
import app.tadabbur.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

    public List<Word> getWordsFromSuras(List<Integer> suraNumbers) {
        List<Word> words = wordRepository.findBySuraNumberIn(suraNumbers);
        // Перемешиваем слова в случайном порядке для тестирования
        Collections.shuffle(words);
        return words;
    }
}