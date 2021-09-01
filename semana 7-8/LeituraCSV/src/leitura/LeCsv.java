
package leitura;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.xml.namespace.QName;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        int c;
        /*
        while ((c = in.read()) != -1) {
            c = in.read();           
        }       
        in.close(); 
        */
        int count = 0;

        try(BufferedReader in_f = new BufferedReader(new FileReader(inputFile)))
        {
            String linha;
            while((linha = in_f.readLine()) != null){

                //System.out.println(linha);
                String[] separa_cliente = linha.split(";");

                if(!separa_cliente[5].equalsIgnoreCase("total_compras")){
                    
                    Cliente cliente = new Cliente();
                    //System.out.println(separa_cliente[5]);
                    cliente.setId(separa_cliente[0]);
                    cliente.setNome(separa_cliente[1]);
                    cliente.setEmail(separa_cliente[2]);
                    cliente.setTelefone(separa_cliente[4]);
                    double converter = Double.parseDouble(separa_cliente[5]);
                    System.out.println(converter);
                    cliente.setTotalCompras(converter);

                    clientes.add(cliente);

                    //count += 1;
                    //System.out.println(count +":contador");
                    
                    
                }

            }
            in_f.close();

        }
        catch(IOException error) {

        }
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
