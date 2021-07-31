/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

/**
 *
 * @author User
 */
public class FabricaBotoesIcones extends FabricaAbstrataBotoes{
    
    
    @Override
    public ButtonOK criaBotaoOK(){
        return new ButtonOK();
    }
    
    @Override
    public ButtonCancel criaBotaoCancel(){
        return new ButtonCancel();
    }
}
