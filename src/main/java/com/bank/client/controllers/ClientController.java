package com.bank.client.controllers;


import com.bank.client.dto.ClientDto;
import com.bank.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients/")
public class ClientController {

    @Autowired
    ClientService clientService;
   @GetMapping("{id}")
    public ClientDto getClient(@PathVariable("id") Long id){
      return clientService.getClient(id);
   }


}
