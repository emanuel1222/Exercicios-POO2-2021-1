/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.automatico;

import java.util.List;

/**
 *
 * @author marke
 */
public interface SaqueHandler {
    public void setNextHandler(SaqueHandler handler);
    public void processHander(List lista, int valor);   
}
