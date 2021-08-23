package br.com.bilhete.agencia_viagem.model;
import javax.persistence.Column;


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
import javax.persistence.Table;

import scala.collection.immutable.List;

@Entity
@Table(name="agencia")
public class Agencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "endereco", nullable = false)
    private String endereco;
    @Column(name = "estahAberta", nullable = false)
    private int estahAberta;

    //@OneToMany(mappedBy = "cpf")
    //private LinkedList<Balconista> balconistas= new LinkedList<Balconista>();
    //@OneToMany(mappedBy = "nomeAgencia")
    //private ArrayList<Balconista> balconistas = new ArrayList<Balconista>();
    

    //@OneToMany(mappedBy = "numBilhete")
    //private LinkedList<Bilhete> bilhetes = new LinkedList<Bilhete>();

    
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

    public int getEstahAberta(){
        return estahAberta;
    }

    public void setEstahAberta(int estahAberta){
        this.estahAberta = estahAberta;
    }
/*
    public boolean statusFuncionamentoAgencia(){
        //funcao a ser construida
        return true;
    }
*/
}