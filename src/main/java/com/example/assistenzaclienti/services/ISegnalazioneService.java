package com.example.assistenzaclienti.services;

import com.example.assistenzaclienti.dto.SegnalazioneDto;
import com.example.assistenzaclienti.entities.Segnalazione;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ISegnalazioneService {
    boolean createSegnalazione(SegnalazioneDto segnalazioneDto);

    boolean deleteSegnalazione(int id);

    List<SegnalazioneDto> filteredBy(String cognome, LocalDate data);
}
