package serializacaomensagem;
import java.io.*;

import javax.imageio.IIOException;

public class UsuarioSerializado{

    

    public void serializarUsuario(Usuario u){
        
        try{
            String current = new java.io.File(".").getCanonicalPath();
            FileOutputStream usuarioSerializado = new FileOutputStream(current + "\\src\\User.ser");
            ObjectOutputStream outputUserSerializado = new ObjectOutputStream(usuarioSerializado);
            outputUserSerializado.writeObject(u);
            outputUserSerializado.close();
        } catch (IOException error){}
  
    }

    public void deserializarUsuario() throws ClassNotFoundException{

        Usuario user = new Usuario();
        try{
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "\\src\\User.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (Usuario) in.readObject();
            in.close();
            System.out.println("nome: " + user.getUsuario());

        } catch (IOException error){}
    }

    
}
