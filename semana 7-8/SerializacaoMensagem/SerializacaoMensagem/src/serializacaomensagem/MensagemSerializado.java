package serializacaomensagem;
import java.io.*;

import javax.imageio.IIOException;

public class MensagemSerializado {


    public void serializarMsg(Mensagem msg){
        
        try{
            String current = new java.io.File(".").getCanonicalPath();
            FileOutputStream msgSerializado = new FileOutputStream(current + "\\src\\Msg.ser");
            ObjectOutputStream outputUserSerializado = new ObjectOutputStream(msgSerializado);
            outputUserSerializado.writeObject(msg);
            outputUserSerializado.close();
        } catch (IOException error){}  
    }

    public void deserializarMsg() throws ClassNotFoundException{

        Mensagem msg = new Mensagem();
        try{
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "\\src\\Msg.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            msg = (Mensagem) in.readObject();
            in.close();
            System.out.println("mensagem: " + msg.getTexto());

        } catch (IOException error){}
    }
}
