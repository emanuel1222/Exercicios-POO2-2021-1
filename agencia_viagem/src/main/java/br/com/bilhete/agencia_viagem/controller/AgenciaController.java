package br.com.bilhete.agencia_viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bilhete.agencia_viagem.controller.dto.AgenciaDto;
import br.com.bilhete.agencia_viagem.model.Agencia;
import br.com.bilhete.agencia_viagem.repository.AgenciaRepository;

@RestController
public class AgenciaController {
	
	@Autowired
	private AgenciaRepository agenciaRepository;
    
    @RequestMapping("/agencia")
    public List<AgenciaDto> getAgencia(String nomeAgencia){
        //Agencia agencia = new Agencia("Vix passagens", "Av. vitoria - 5582, Vitoria/ES", 1);
    	//System.out.println(nomeAgencia);
    	if (nomeAgencia == null) {
            List<Agencia> agencia = agenciaRepository.findAll();
        	return AgenciaDto.converter(agencia);    		
    	} else {
    		List<Agencia> agencia = agenciaRepository.findByNome(nomeAgencia);
    		return (List<AgenciaDto>) AgenciaDto.converter(agencia); 
    	}
    	
    	

    }
}
