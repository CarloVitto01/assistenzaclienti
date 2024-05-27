package com.example.assistenzaclienti.mapper;

import com.example.assistenzaclienti.dto.TecnicoDto;
import com.example.assistenzaclienti.entities.Tecnico;
import org.springframework.stereotype.Component;

@Component
public class TecnicoMapper {

    public TecnicoDto toTecnicoDto(Tecnico tecnico){
        TecnicoDto tecnicoDto = new TecnicoDto(
                tecnico.getId_tecnico(),
                tecnico.getNome(),
                tecnico.getCognome(),
                tecnico.getEmail(),
                tecnico.getTelefono(),
                tecnico.getSpecializzazione(),
                tecnico.getData_assunzione()
        );
        return tecnicoDto;
    }

    public Tecnico toTecnicoEntity(TecnicoDto tecnicoDto){
        Tecnico tecnico = new Tecnico(
                tecnicoDto.getId_tecnico(),
                tecnicoDto.getNome(),
                tecnicoDto.getCognome(),
                tecnicoDto.getEmail(),
                tecnicoDto.getTelefono(),
                tecnicoDto.getSpecializzazione(),
                tecnicoDto.getData_assunzione()
        );
        return tecnico;
    }
}
