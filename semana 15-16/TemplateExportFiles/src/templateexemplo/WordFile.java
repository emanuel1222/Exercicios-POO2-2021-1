package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordFile extends ExportTemplateFiles{

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
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
        
    }

    @Override
    protected void saveFile() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportTemplateFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
