/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacaomensagem;
import java.io.*;

import javax.imageio.IIOException;
/**
 *
 * @author User
 */
public class SerializacaoMensagem {

    /**
     * @param args the command line arguments
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        String current = new java.io.File(".").getCanonicalPath();
        
        Usuario usuario = new Usuario();
        usuario.setUsuario("Emanuel");

        Mensagem msg = new Mensagem();
        msg.setTexto("exercicio poo 2 - serializacao");
        /*
        File arq = new File(current + "\\src\\arquivo.ser");
        try{
            ObjectOutputStream outputSerializado = new ObjectOutputStream(new FileOutputStream(arq));
            outputSerializado.writeObject(usuario);
            outputSerializado.writeObject(msg);
            outputSerializado.close();
        } catch (IOException error){

        }
        */
  
            /*
            FileOutputStream usuarioSerializado = new FileOutputStream(current + "\\src\\User.ser");
            ObjectOutputStream outputUserSerializado = new ObjectOutputStream(usuarioSerializado);
            outputUserSerializado.writeObject(usuario);
            outputUserSerializado.close();

            File arq = new File(current + "\\src\\Message.ser");
            ObjectOutputStream outputSerializado = new ObjectOutputStream(new FileOutputStream(arq));
            outputSerializado.writeObject(msg);
            outputSerializado.close();
            
            FileOutputStream messageSerializado = new FileOutputStream(current + "\\src\\Message.ser");
            ObjectOutputStream outputMessageSerializado = new ObjectOutputStream(messageSerializado);
            outputMessageSerializado.writeObject(msg);
            outputMessageSerializado.close();
            */
            //FileInputStream fileIn = new FileInputStream(current + "\\src\\arq_serializado.ser");
            //ObjectInputStream in = new ObjectInputStream(fileIn);

        UsuarioSerializado pessoa = new UsuarioSerializado();
        pessoa.serializarUsuario(usuario);
        pessoa.deserializarUsuario();

        MensagemSerializado mensagem = new MensagemSerializado();
        mensagem.serializarMsg(msg);
        mensagem.deserializarMsg();





        System.out.println("arquivo criado: " + current + "\\src\\arq_serializado.ser");
        




    }
    
}
