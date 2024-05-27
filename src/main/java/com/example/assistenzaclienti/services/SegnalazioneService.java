package com.example.assistenzaclienti.services;

import com.example.assistenzaclienti.dto.SegnalazioneDto;
import com.example.assistenzaclienti.entities.Segnalazione;
import com.example.assistenzaclienti.mapper.SegnalazioneMapper;
import com.example.assistenzaclienti.repositories.SegnalazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SegnalazioneService implements ISegnalazioneService{

    @Autowired
    SegnalazioneRepository segnalazioneRepository;
    @Autowired
    SegnalazioneMapper segnalazioneMapper;

    @Override
    public boolean createSegnalazione(SegnalazioneDto segnalazioneDto) {
        segnalazioneDto.setData_ora(LocalDateTime.now());
        segnalazioneRepository.save(segnalazioneMapper.toSegnalazioneEntity(segnalazioneDto));
        return true;
    }
    @Override
    public boolean deleteSegnalazione(int id) {
        segnalazioneRepository.deleteById(id);
        return true;
    }

    @Override
    public List<SegnalazioneDto> filteredBy(String cognome, LocalDate data) {
        List<Segnalazione> segnalazioneList;
        if (cognome == null && data != null) {
            segnalazioneList = segnalazioneRepository.segnalazioneFilteredByDate(data);
            System.out.println(data);
        } else if (cognome != null && data == null) {
            segnalazioneList = segnalazioneRepository.segnalazioneFilteredBySurname(cognome);
        } else if (cognome != null && data != null) {
            segnalazioneList = segnalazioneRepository.segnalazioneFilteredByDateAndSurname(data, cognome);
            System.out.println(data);
        } else {
            segnalazioneList = segnalazioneRepository.findAll();
        }
        return segnalazioneMapper.mapListToSegnalazioneDtos(segnalazioneList);
    }
}
