package br.com.bilhete.agencia_viagem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import scala.collection.immutable.List;

@Entity
public class Agencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private boolean estahAberta;

    //@OneToMany(mappedBy = "cpf")
    //private LinkedList<Balconista> balconistas= new LinkedList<Balconista>();
    //@OneToMany(mappedBy = "nomeAgencia")
    //private ArrayList<Balconista> balconistas = new ArrayList<Balconista>();

    //@OneToMany(mappedBy = "numBilhete")
    //private LinkedList<Bilhete> bilhetes = new LinkedList<Bilhete>();





    public Agencia(String nome, String endereco, boolean estahAberta){
        
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEstahAberta(estahAberta);
    }
    
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

    public boolean getEstarAberta(){
        return estahAberta;
    }

    public void setEstahAberta(boolean estahAberta){
        this.estahAberta = estahAberta;
    }
/*
    public boolean statusFuncionamentoAgencia(){
        //funcao a ser construida
        return true;
    }
*/
}