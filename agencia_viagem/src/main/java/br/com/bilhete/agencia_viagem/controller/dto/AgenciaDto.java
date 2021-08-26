package br.com.bilhete.agencia_viagem.controller.dto;
import java.util.stream.Collectors;
import java.util.List;


import br.com.bilhete.agencia_viagem.model.Agencia;

public class AgenciaDto {
	
	private Long id;
    private String nome;
    private String endereco;
    private int estahAberta;

    public AgenciaDto(Agencia agencia){
    	this.id = agencia.getId();
        this.nome = agencia.getNome();
        this.endereco = agencia.getEndereco();
        this.estahAberta = agencia.getEstahAberta();
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
