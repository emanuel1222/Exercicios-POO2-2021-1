/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraomosca;

import java.util.ArrayList;
import modelo.Estado;
import modelo.Item;
import modelo.Pedido;
import modelo.StatusItem;

/**
 *
 * @author marke
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {            
        ArrayList<Pedido> listaPedidos = new ArrayList();        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            Item item1 = new Item();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis"); 
            StatusItem statusItem1 = new StatusItem(Estado.CARRINHO, true, false);
            item1.setStatus(statusItem1);
            Item item2 = new Item();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            StatusItem statusItem2 = new StatusItem(Estado.CARRINHO, true, false);
            item1.setStatus(statusItem2);
            Item item3 = new Item();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            StatusItem statusItem3 = new StatusItem(Estado.CARRINHO, true, false);
            item1.setStatus(statusItem3);
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);                                   
            listaPedidos.add(pedido);
        }
        //calcula a quantidade de memória consumida pelo programa java
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(listaPedidos.size());    
    }
    
}
