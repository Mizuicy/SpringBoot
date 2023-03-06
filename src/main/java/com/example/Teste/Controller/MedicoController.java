package com.example.Teste.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Teste.Medicopp;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    
    @PostMapping
    public void cadastrar(@RequestBody Medicopp medico){
        System.out.println(medico);
    }
}
