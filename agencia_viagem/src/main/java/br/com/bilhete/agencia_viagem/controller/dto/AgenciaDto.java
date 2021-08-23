package br.com.bilhete.agencia_viagem.controller.dto;
import java.util.stream.Collectors;
import java.util.List;


import br.com.bilhete.agencia_viagem.model.Agencia;

public class AgenciaDto {
    private String nome;
    private String endereco;
    private int estahAberta;

    public AgenciaDto(Agencia agencia){
        this.nome = ((Agencia) agencia).getNome();
        this.endereco = ((Agencia)agencia).getEndereco();
        this.estahAberta = ((Agencia)agencia).getEstahAberta();
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getEstarAberta(){
        return estahAberta;
    }

    public static List<AgenciaDto> converter(List<Agencia> agencia) {
       //AgenciaDto agenciaDto = new AgenciaDto((Agencia)agencia);
       //return agenciaDto;
    	
       return agencia.stream().map(AgenciaDto::new).collect(Collectors.toList());
    }
}
