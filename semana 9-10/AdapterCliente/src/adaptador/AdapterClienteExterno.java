/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import adaptercliente.model.Cliente;
import adaptercliente.model.ICliente;
import lib.ClienteExterno;

/**
 *
 * @author marke
 */
public class AdapterClienteExterno implements ICliente{
    
    //Cliente cliente = null;
 
    
    public Cliente converterCliente(ClienteExterno ce){  
        
        
        
        Cliente cliente = new Cliente();
                
        String nomeCompleto = ce.getNome().concat(" " + ce.getSobreNome());
        cliente.setNomeCompleto(nomeCompleto);
        
        String telefone = ce.getDddTelefone().concat(ce.getTelefone());
        cliente.setTelefone(telefone);
        
        String email = ce.getEmail();
        cliente.setEmail(email);
        
        String celular = ce.getDddCelular().concat(ce.getCelular());
        cliente.setCelular(celular);
        
        return cliente;
    }
    
    @Override
    public String getNomeCompleto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCelular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCelular(String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
