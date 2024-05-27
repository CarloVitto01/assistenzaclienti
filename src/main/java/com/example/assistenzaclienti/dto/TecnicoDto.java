package com.example.assistenzaclienti.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class TecnicoDto {

    private int id_tecnico;
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String specializzazione;
    private LocalDate data_assunzione;

    public TecnicoDto(int id_tecnico, String nome, String cognome, String email, String telefono, String specializzazione, LocalDate data_assunzione) {
        this.id_tecnico = id_tecnico;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.specializzazione = specializzazione;
        this.data_assunzione = data_assunzione;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public LocalDate getData_assunzione() {
        return data_assunzione;
    }

    public void setData_assunzione(LocalDate data_assunzione) {
        this.data_assunzione = data_assunzione;
    }
}
