package com.example.assistenzaclienti.mapper;

import com.example.assistenzaclienti.dto.ClienteDto;
import com.example.assistenzaclienti.entities.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteDto toClienteDto(Cliente cliente){
        ClienteDto clienteDTO = new ClienteDto(
                cliente.getId_cliente(),
                cliente.getNome(),
                cliente.getCognome(),
                cliente.getEmail(),
                cliente.getTelefono()
        );
        return clienteDTO;
    }

    public Cliente toClenteEntity(ClienteDto clienteDTO){
        Cliente cliente = new Cliente(
                clienteDTO.getId_cliente(),
                clienteDTO.getNome(),
                clienteDTO.getCognome(),
                clienteDTO.getEmail(),
                clienteDTO.getTelefono()
        );
        return cliente;
    }
}
