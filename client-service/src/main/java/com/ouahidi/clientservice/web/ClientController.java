package com.ouahidi.clientservice.web;

import com.ouahidi.clientservice.entities.Client;
import com.ouahidi.clientservice.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    ClientRepository clientRepository;
    @GetMapping("/clients")
    public List<Client> allClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client aClient(@PathVariable  Long id){
        return clientRepository.findById(id).get();
    }


}


