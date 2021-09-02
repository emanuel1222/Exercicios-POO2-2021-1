import java.io.IOException;

public class MoveFileSingle extends Strategy {

    public MoveFileSingle(String opcao) {
        super(opcao);
    }



    @Override
    public void execute(){

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
