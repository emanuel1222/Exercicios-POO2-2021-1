package br.com.bilhete.agencia_viagem.controller.dto;

import br.com.bilhete.agencia_viagem.model.Agencia;

public class AgenciaDto {
    private String nome;
    private String endereco;
    private boolean estahAberta;

    public AgenciaDto(Agencia agencia){
        this.nome = agencia.getNome();
        this.endereco = agencia.getEndereco();
        this.estahAberta = agencia.getEstarAberta();
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public boolean getEstarAberta(){
        return estahAberta;
    }

    public static AgenciaDto converter(Agencia agencia) {
       AgenciaDto agenciaDto = new AgenciaDto(agencia);
       return agenciaDto;
    }
}
