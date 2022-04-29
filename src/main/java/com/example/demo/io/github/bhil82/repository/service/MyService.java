package com.example.demo.io.github.bhil82.repository.service;


import com.example.demo.io.github.bhil82.model.Cliente;
import com.example.demo.io.github.bhil82.repository.myRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nataribu on 29/04/2022.
 */
@Service
public class MyService {
    private myRepository repository;

    public MyService(myRepository repository){
        this.repository = repository;
    }

    public void SalvarCliente(Cliente cliente){
    ValidarCliente(cliente);
        myRepository meuRepository = new myRepository();
        meuRepository.Persistir(cliente);
    }
    public void ValidarCliente(Cliente cliente){
        //aplica validções

    }
}
