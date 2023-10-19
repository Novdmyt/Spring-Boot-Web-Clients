package com.example.app.SpringBootWebClients.repository;

import com.example.app.SpringBootWebClients.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
