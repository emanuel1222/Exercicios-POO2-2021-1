/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.arquivos;

/**
 *
 * @author marke
 */
public class CompositeArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Usei o SLIDE 18 da explicação sobre o padrão composite para fazer o exercicio:  https://docs.google.com/presentation/d/1zzNK3AZWyL5e-s8e0ngKwu4wfoe_7yBEQ_hLndilYlE/edit#slide=id.p18
        //O exercicio foi feito encima do diagrama citado no Slide 18 dos slides acima, achei o diagrama dos slides mais simples para entender
        
        Arquivo boleto_pdf = new Arquivo("Kabum.pdf");
        Arquivo pagamentoLuz_pdf = new Arquivo("Escelsa.pdf");
        Arquivo pagamentoAgua_pdf = new Arquivo("Cesan.pdf");
        Arquivo projeto_txt = new Arquivo("Especificacao.txt");
        Arquivo anotacoesAula_pdf = new Arquivo("Anotacoes aula - 23/08");
        Arquivo segundaVia_passagem = new Arquivo("Ticket Latam linhas aereas");
        
        Pasta boletos = new Pasta("Pasta de boletos");
        boletos.inserirArquivo(boleto_pdf);
        boletos.inserirArquivo(pagamentoLuz_pdf);
        boletos.inserirArquivo(pagamentoAgua_pdf);
        
        Pasta projetos = new Pasta("Pasta de projetos");
        projetos.inserirArquivo(projeto_txt);
        
        Pasta anotacoes = new Pasta("Pasta de anotacoes");
        anotacoes.inserirArquivo(anotacoesAula_pdf);
        
        Pasta passagens = new Pasta("Pasta de passagens");
        passagens.inserirArquivo(segundaVia_passagem);
        
        Pasta meus_documentos = new Pasta("Meus documentos");
        meus_documentos.inserirPasta(boletos);
        meus_documentos.inserirPasta(projetos);
        
        Pasta videos = new Pasta("Meus videos");
        Arquivo serie = new Arquivo("O Gavião arqueiro e o Soldado invernal");
        videos.inserirArquivo(serie);
        
        Pasta musicas = new Pasta("minhas musicas");
        Arquivo musica = new Arquivo("Criolo - não existe amor em SP.mp3");
        musicas.inserirArquivo(musica);
        
        Pasta multimidia = new Pasta("Multimidia");
        multimidia.inserirPasta(videos);
        multimidia.inserirPasta(musicas);
        
        meus_documentos.inserirPasta(multimidia);
        
        Arquivo instalador_vscode = new Arquivo("VSCodex64.exe");
        meus_documentos.inserirArquivo(instalador_vscode);
            
        meus_documentos.printNomeDoArquivo();
        multimidia.printNomeDoArquivo();
        musicas.printNomeDoArquivo();
        
        meus_documentos.removerArquivo(instalador_vscode);
        
    }
    
}
