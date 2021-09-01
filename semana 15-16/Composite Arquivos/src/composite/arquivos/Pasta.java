/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.arquivos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marke
 */
public class Pasta extends Arquivos{
    
    private List<Arquivos> arquivos;

    public Pasta(String nome) {
        super(nome);
        this.arquivos = new ArrayList<Arquivos>();
    }

    public List<Arquivos> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivos> arquivos) {
        this.arquivos = arquivos;
    }
    
    public void printNomeDoArquivo(){
        System.out.println("Nome do arquivo ou pasta: "+ nome);
    }
    
    public void inserirArquivo(Arquivo arquivo){
        arquivos.add(arquivo);
    }
    
    public void removerArquivo(Arquivo arquivo){
        arquivos.remove(arquivo);
    }
    
    public Arquivo getArquivo(int posicao){
        return (Arquivo)arquivos.get(posicao);
    }
    
    public int getNumArquivos(){
        return arquivos.size();
    }

    void inserirPasta(Pasta pasta) {
        arquivos.add(pasta);
    }



    
    
}
