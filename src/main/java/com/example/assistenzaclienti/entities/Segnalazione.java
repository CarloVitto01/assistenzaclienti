package com.example.assistenzaclienti.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "segnalazione")
public class Segnalazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_segnalazione")
    private int id_segnalazione;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Europe/Rome")
    private LocalDateTime data_ora;

    public Segnalazione(int id_segnalazione, Cliente cliente, Tecnico tecnico, LocalDateTime data_ora) {
        this.id_segnalazione = id_segnalazione;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.data_ora = data_ora;
    }

    public Segnalazione() {
    }

    public int getId_segnalazione() {
        return id_segnalazione;
    }

    public void setId_segnalazione(int id_segnalazione) {
        this.id_segnalazione = id_segnalazione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDateTime getData_ora() {
        return data_ora;
    }

    public void setData_ora(LocalDateTime data_ora) {
        this.data_ora = data_ora;
    }
}
