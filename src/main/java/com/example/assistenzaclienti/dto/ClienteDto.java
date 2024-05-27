package com.example.assistenzaclienti.dto;

import com.example.assistenzaclienti.entities.Cliente;
import com.example.assistenzaclienti.entities.Tecnico;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class ClienteDto {

    private int id_cliente;
    private String nome;
    private String cognome;
    private String email;
    private String telefono;

    public ClienteDto(int id_cliente, String nome, String cognome, String email, String telefono) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
}
