import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoveFileExtendThread extends Thread {

    private String threadName;
    private int contador_thread = 0;

    public MoveFileExtendThread(String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        contador_thread = +1;
        System.out.println("---Iniciando thread  " + contador_thread);
        
        try {
            Thread.sleep(400);

        } catch (InterruptedException ex) {
            Logger.getLogger(MoveFileExtendThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        MoveFile moverArq = new MoveFile();
        try {
            
            MoveFile.mainTransfereArquivos();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
    }


    
}
