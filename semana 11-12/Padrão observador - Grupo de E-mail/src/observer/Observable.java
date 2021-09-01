/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author marke
 */
public class Observable {
    
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObservador (Observer ob) {
        this.monitores.add(ob);
    }
    
    public void deleteObservador(Observer ob) {
        monitores.remove(ob);
    }
    
    public void notificarObservadores(){
        for(Observer ob:monitores){
            ob.update(this);
        }
    }


}
