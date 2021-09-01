/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import observer.Observable;

/**
 *
 * @author marke
 */
public class CaixaEntradaGrupo extends Observable {
    
    private String mensagem;


    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        
        //Observable obs = new Observable();
        notificarObservadores();
    }
    
    
    
}
