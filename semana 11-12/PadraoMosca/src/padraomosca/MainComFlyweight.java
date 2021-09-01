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
import padraomosca.modelo.FlyweightStatusItem;

/**
 *
 * @author marke
 */
public class MainComFlyweight {
    public static void main(String[] args) {  
        
        StatusItem statusItem = new StatusItem(Estado.CARRINHO, true, false);
        ArrayList<Pedido> listaPedidos = new ArrayList();    
        
        for(int i=0; i< 200000; i++){             
            
            Pedido pedido = new Pedido();
            FlyweightStatusItem stt = new FlyweightStatusItem();
            
            Item item1 = new Item();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");
            item1.setStatus(stt.getStatusFlyweight(statusItem));
            
            Item item2 = new Item();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(stt.getStatusFlyweight(statusItem));
            
            Item item3 = new Item();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(stt.getStatusFlyweight(statusItem));
            
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
