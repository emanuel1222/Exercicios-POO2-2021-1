package br.com.bilhete.agencia_viagem.controller;


import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bilhete.agencia_viagem.controller.dto.AgenciaDto;
import br.com.bilhete.agencia_viagem.controller.form.AgenciaForm;
import br.com.bilhete.agencia_viagem.model.Agencia;
import br.com.bilhete.agencia_viagem.repository.AgenciaRepository;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {
	
	@Autowired
	private AgenciaRepository agenciaRepository;
    
    @GetMapping
    public List<AgenciaDto> getAgencia(String nomeAgencia){
        //Agencia agencia = new Agencia("Vix passagens", "Av. vitoria - 5582, Vitoria/ES", 1);
    	//System.out.println(nomeAgencia);

		//Dto = Saem dados direto da API para o cliente
    	if (nomeAgencia == null) {
            List<Agencia> agencia = agenciaRepository.findAll();
        	return AgenciaDto.converter(agencia);    		
    	} else {
    		List<Agencia> agencia = agenciaRepository.findByNome(nomeAgencia);
    		return (List<AgenciaDto>) AgenciaDto.converter(agencia); 
    	}
    }
		////Form = Dados que vem do cliente para a API
	@PostMapping
	@Transactional
	public ResponseEntity<AgenciaDto> cadastrarAgencia(@RequestBody @Validated AgenciaForm agenciaForm, UriComponentsBuilder uriBuilder){
		Agencia agencia = agenciaForm.converter();
		agenciaRepository.save(agencia);
		URI uri = uriBuilder.path("/agencia/{id}").buildAndExpand(agencia.getId()).toUri();
		return ResponseEntity.created(uri).body(new AgenciaDto(agencia));
	}
}
