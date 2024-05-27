package com.example.assistenzaclienti.dto;

import java.time.LocalDateTime;

public class SegnalazioneDto {

    private int id_segnalazione;
    private ClienteDto cliente;
    private TecnicoDto tecnico;
    private LocalDateTime data_ora;

    public SegnalazioneDto(int id_segnalazione, ClienteDto cliente, TecnicoDto tecnico, LocalDateTime data_ora) {
        this.id_segnalazione = id_segnalazione;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.data_ora = data_ora;
    }

    public int getId_segnalazione() {
        return id_segnalazione;
    }

    public void setId_segnalazione(int id_segnalazione) {
        this.id_segnalazione = id_segnalazione;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public TecnicoDto getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoDto tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDateTime getData_ora() {
        return data_ora;
    }

    public void setData_ora(LocalDateTime data_ora) {
        this.data_ora = data_ora;
    }
}

