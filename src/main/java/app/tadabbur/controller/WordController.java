package app.tadabbur.controller;

import app.tadabbur.model.dto.WordDTO;
import app.tadabbur.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/words")
@RequiredArgsConstructor
public class WordController {
    private final WordService wordService;

    @PostMapping("/test")
    public List<WordDTO> getWordsForTest(@RequestBody List<Integer> suraNumbers) {
        return wordService.getWordsFromSuras(suraNumbers);
    }
}