
package leitura;


import java.util.Iterator;
import java.util.LinkedList;


public class TotalCompras {
    
     public double calculaSomaTotal(LinkedList<Cliente> clientes){        
        Iterator listaClientes = clientes.iterator();
        double somaTotal=0;
        while(listaClientes.hasNext()){
            Cliente cliente = (Cliente) listaClientes.next();
            //System.out.println(cliente.getTotalCompras()+ ":total compras");
            somaTotal += cliente.getTotalCompras();            
        }
        return somaTotal;        
    }
}
