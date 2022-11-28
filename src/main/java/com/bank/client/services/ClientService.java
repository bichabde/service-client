package com.bank.client.services;

import com.bank.client.dto.ClientDto;
import com.bank.client.entities.Client;
import com.bank.client.exception.ResourceNotFoundException;
import com.bank.client.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

   @Autowired
    ClientRepository clientRepository;
    @Autowired
    ModelMapper modelMapper;

    public ClientDto getClient(Long idClient){
        Optional<Client> client= clientRepository.findById(idClient);

        if(!client.isPresent()){
          throw  new ResourceNotFoundException("client not found "+idClient);

        }
      return   modelMapper.map(client.get(),ClientDto.class);

    }
}
