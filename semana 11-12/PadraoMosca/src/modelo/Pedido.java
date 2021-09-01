/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marke
 */
public class Pedido {
    private List<Item> item = new ArrayList<>();


    public void addItemPedido(Item item2) {
        item.add(item2);
    }
    
}
