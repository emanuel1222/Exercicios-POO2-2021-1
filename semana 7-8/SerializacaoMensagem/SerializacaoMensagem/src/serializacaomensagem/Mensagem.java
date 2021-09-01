package serializacaomensagem;

import java.io.Serializable;

public class Mensagem implements Serializable {
    String texto;


    public void setTexto(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }
}


