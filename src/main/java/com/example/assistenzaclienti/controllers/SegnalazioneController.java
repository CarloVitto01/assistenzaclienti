package com.example.assistenzaclienti.controllers;

import com.example.assistenzaclienti.dto.SegnalazioneDto;
import com.example.assistenzaclienti.mapper.SegnalazioneMapper;
import com.example.assistenzaclienti.services.ISegnalazioneService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/segnalazione")
public class SegnalazioneController {
    @Autowired
    private ISegnalazioneService iSegnalazioneService;
    @Autowired
    private SegnalazioneMapper segnalazioneMapper;

    @Operation(summary = "Inserisce una nuova segnalazione")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La segnalazione  creata correttamente")
    })
    @PostMapping(value = "/")
    public ResponseEntity<Boolean> createSegnalazione(@RequestBody SegnalazioneDto segnalazioneDTO) {
        boolean createSegnalazione = iSegnalazioneService.createSegnalazione(segnalazioneDTO);
        return new ResponseEntity<>(createSegnalazione, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una segnalazione esistente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Segnalazione eliminata correttamente")
    })
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteSegnalazione(@PathVariable int id) {
        boolean deleteSegnalazione = iSegnalazioneService.deleteSegnalazione(id);
        return new ResponseEntity<>(deleteSegnalazione, HttpStatus.OK);
    }

    @Operation(summary = "Inserisci i filtri")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Segnalazioni trovate correttamente")
    })
    @GetMapping(value = "/")
    public ResponseEntity<List<SegnalazioneDto>> getFilteredSegnalazioni(
            @RequestParam(required = false) String cognome,
            @RequestParam(required = false) LocalDate data
    ) {
        List<SegnalazioneDto> dtoList = iSegnalazioneService.filteredBy(cognome, data);
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }
}
