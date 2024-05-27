package com.example.assistenzaclienti.repositories;

import com.example.assistenzaclienti.entities.Segnalazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SegnalazioneRepository extends JpaRepository<Segnalazione, Integer> {

    @Query("SELECT s FROM Segnalazione s WHERE DATE(s.data_ora) = :data")
    List<Segnalazione> segnalazioneFilteredByDate(@Param("data") LocalDate data);

    @Query("SELECT s FROM Segnalazione s WHERE s.cliente.cognome LIKE %:cognome%")
    List<Segnalazione> segnalazioneFilteredBySurname(@Param("cognome") String cognome);

    @Query("SELECT s FROM Segnalazione s WHERE DATE(s.data_ora) = :data AND s.cliente.cognome LIKE %:cognome%")
    List<Segnalazione> segnalazioneFilteredByDateAndSurname(@Param("data") LocalDate data, @Param("cognome") String cognome);
}
