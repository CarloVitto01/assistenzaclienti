package com.example.assistenzaclienti.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tecnico")
    private int id_tecnico;
    @Column(name = "nome", length = 30)
    private String nome;
    @Column(name = "cognome", length = 30)
    private String cognome;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "telefono", length = 15)
    private String telefono;
    @Column(name = "specializzazione", length = 15)
    private String specializzazione;
    @Column(name = "data_assunzione")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Europe/Rome")
    private LocalDate data_assunzione;

    public Tecnico(int id_tecnico, String nome, String cognome, String email, String telefono, String specializzazione, LocalDate data_assunzione) {
        this.id_tecnico = id_tecnico;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.specializzazione = specializzazione;
        this.data_assunzione = data_assunzione;
    }

    public Tecnico() {
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
