/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacaomensagem;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Usuario implements Serializable{
    String nome;

    public void setUsuario(String usuario) {
        this.nome = usuario;
    }

    public String getUsuario(){
        return nome;
    }
    
}
