/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraomosca.modelo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.StatusItem;
import modelo.Estado;

/**
 *
 * @author marke
 */
public class FlyweightStatusItem {
    
    protected ArrayList<StatusItem> status;
    
    public FlyweightStatusItem(){
        status = new ArrayList<StatusItem>();
        status.add(new StatusItem(Estado.CARRINHO, true, false));
        status.add(new StatusItem(Estado.FECHADO, true, false));
        status.add(new StatusItem(Estado.PAGO, true, true));
        status.add(new StatusItem(Estado.ENVIADO, false, true));
        status.add(new StatusItem(Estado.ENTREGUE, false, true));
    }
    
    public StatusItem getStatusFlyweight(StatusItem estadoItem){
        
        
        if (containsStatus(estadoItem,status.get(0))){
            return status.get(0);
        } else if (containsStatus(estadoItem,status.get(1))){
            return status.get(1);
        } else if (containsStatus(estadoItem,status.get(2))){
            return status.get(2);
        } else if (containsStatus(estadoItem,status.get(3))){
            return status.get(3);
        } else if (containsStatus(estadoItem,status.get(4))) {
            return status.get(4);
        }
        
        return null;
    }
    
    private boolean containsStatus(StatusItem status1, StatusItem status2) {
        if((status1.getCompraConcluida() == status2.getCompraConcluida()) 
        && (status1.getEstado() == status2.getEstado()) 
        && (status1.getPodeCancelar() == status2.getPodeCancelar())){
            
            return true;
        } else {
            return false;
        }     
    }
    

}
