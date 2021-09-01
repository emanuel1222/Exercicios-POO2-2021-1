
package caixa.automatico;

import java.util.List;
import javax.swing.JOptionPane;


public abstract class AbstractSaqueHandler implements SaqueHandler {
    private SaqueHandler nextSaqueHandler;
    
    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.nextSaqueHandler = handler;
    }
    public void processHander(List lista, int valor) {                
        if(valor > 0 ){
              valor = handleSaque(valor);   
        }    
    
        //if (nextPagamentoHandler != null && valor >0)
        //    this.nextPagamentoHandler.processHander(lista, valor);
        
    }
    protected abstract int getValorSaque();
    
    /*
    protected int perguntaPagamento(String mensagem, int valor){
        String valorPagamento = JOptionPane.showInputDialog(mensagem);
        int valorRestante = 0;
        if(!valorPagamento.equalsIgnoreCase("")){
            valorRestante = valor - Integer.parseInt(valorPagamento);        
        }
        return valorRestante;
    }    
    */
    protected abstract int handleSaque(int valor);
}

