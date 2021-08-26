package br.com.bilhete.agencia_viagem.controller.form;


import br.com.bilhete.agencia_viagem.model.Agencia;

public class AgenciaForm {
    //private Long id;
	@NotNull @NotEmpty @Size(min = 5)
    private String nome;
    private String endereco;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Agencia converter() {
        return new Agencia(nome, endereco);
    }
}
