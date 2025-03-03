package app.tadabbur.controller;

import app.tadabbur.model.dto.SuraDTO;
import app.tadabbur.service.SuraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/suras")
@RequiredArgsConstructor
public class SuraController {
    private final SuraService suraService;

    @GetMapping
    public List<SuraDTO> getAllSuras() {
        return suraService.getAllSuras();
    }
}