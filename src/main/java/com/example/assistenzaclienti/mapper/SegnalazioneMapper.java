package com.example.assistenzaclienti.mapper;

import com.example.assistenzaclienti.dto.SegnalazioneDto;
import com.example.assistenzaclienti.entities.Segnalazione;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SegnalazioneMapper {

    ClienteMapper clienteMapper = new ClienteMapper();
    TecnicoMapper tecnicoMapper = new TecnicoMapper();

    public SegnalazioneDto toSegnalazioneDto(Segnalazione segnalazione){
        SegnalazioneDto segnalazioneDto = new SegnalazioneDto(
                segnalazione.getId_segnalazione(),
                clienteMapper.toClienteDto(segnalazione.getCliente()),
                tecnicoMapper.toTecnicoDto(segnalazione.getTecnico()),
                segnalazione.getData_ora()
        );
        return segnalazioneDto;
    }

    public Segnalazione toSegnalazioneEntity(SegnalazioneDto segnalazioneDto){
        Segnalazione segnalazione = new Segnalazione(
                segnalazioneDto.getId_segnalazione(),
                clienteMapper.toClenteEntity(segnalazioneDto.getCliente()),
                tecnicoMapper.toTecnicoEntity(segnalazioneDto.getTecnico()),
                segnalazioneDto.getData_ora()
        );
        return segnalazione;
    }
    public List<SegnalazioneDto> mapListToSegnalazioneDtos(List<Segnalazione> listEntities){
        return listEntities.stream().map(this::toSegnalazioneDto).toList();
    }
    public List<Segnalazione> mapDtoListToSegnalazioneEntities(List<SegnalazioneDto> listDtos){
        return listDtos.stream().map(this::toSegnalazioneEntity).toList();
    }




}
