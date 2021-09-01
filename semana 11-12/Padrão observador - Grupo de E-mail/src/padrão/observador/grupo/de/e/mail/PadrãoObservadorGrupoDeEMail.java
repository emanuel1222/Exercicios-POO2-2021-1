/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrão.observador.grupo.de.e.mail;

import modelo.CaixaEntradaGrupo;
import modelo.MembroEmail;
import modelo.MembroWhatsapp;

/**
 *
 * @author marke
 */
public class PadrãoObservadorGrupoDeEMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MembroEmail userEmail = new MembroEmail();
        MembroWhatsapp userWpp = new MembroWhatsapp();
        
        CaixaEntradaGrupo cxEntrada = new CaixaEntradaGrupo();
        cxEntrada.addObservador(userEmail);
        cxEntrada.addObservador(userWpp);
        
        cxEntrada.setMensagem("Laura diz: Oi tudo bem?");
        cxEntrada.setMensagem("Laura diz: reunião hoje é que horas??");
        cxEntrada.setMensagem("Lucas responde: Acredito que as 15:00");
        cxEntrada.setMensagem("Laura diz: ok obrigada");
        cxEntrada.setMensagem("Lucas responde: Por nada :)");
        
    }
    
}
