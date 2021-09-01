package templateexemplo;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HtmlFile extends ExportTemplateFiles{

    @Override
    protected void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLineFile((String)linhas);
        }   
        saveFile();
        
    }

    @Override
    protected void printLineFile(String linha) {
        try {
            out.write("<BR>" + linha);
        } catch (IOException ex) {
            Logger.getLogger(ExportTemplateFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void saveFile() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportTemplateFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
