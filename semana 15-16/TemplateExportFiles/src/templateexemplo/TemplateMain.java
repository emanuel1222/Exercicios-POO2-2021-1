
package templateexemplo;

//import org.graalvm.compiler.word.Word;

public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      //ExportFiles export = new ExportFiles();
      HtmlFile html = new HtmlFile();
      WordFile word = new WordFile();
      html.export(texto);
      word.export(texto);
    }
    
}
