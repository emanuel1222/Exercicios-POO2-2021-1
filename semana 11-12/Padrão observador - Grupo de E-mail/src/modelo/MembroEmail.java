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
public class MembroEmail implements Observer {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo caixaEntrada = (CaixaEntradaGrupo) obs;
        
        if((caixaEntrada.getMensagem()).length() > 0 ){
            System.out.println("Mensagem recebida com sucesso por mebro email:"  + caixaEntrada.getMensagem());
        } else {
            System.out.println("Mensagem inválida");
        }
    }
    
}
