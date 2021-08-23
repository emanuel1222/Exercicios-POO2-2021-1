package br.com.bilhete.agencia_viagem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bilhete.agencia_viagem.controller.dto.AgenciaDto;
import br.com.bilhete.agencia_viagem.model.Agencia;

@RestController
public class AgenciaController {
    
    @RequestMapping("/agencia")

    public AgenciaDto getAgencia(){
        Agencia agencia = new Agencia("Vix passagens", "Av. vitoria - 5582, Vitoria/ES", true);
        return AgenciaDto.converter(agencia);
    }
}
