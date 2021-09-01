/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import observer.Observable;
import observer.Observer;

/**
 *
 * @author marke
 */
public class MembroWhatsapp implements Observer{
    
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    @Override
    public void update(Observable obs) {
        
        CaixaEntradaGrupo caixaEntrada = (CaixaEntradaGrupo) obs;
        
        if((caixaEntrada.getMensagem()).length() > 0 ){
            System.out.println("Mensagem recebida com sucesso por membro whatsapp:" + caixaEntrada.getMensagem());
        } else {
            System.out.println("Mensagem inválida");
        }
         
    }
    
}
