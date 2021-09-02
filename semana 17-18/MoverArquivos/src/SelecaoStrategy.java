import java.io.File;

public class SelecaoStrategy {

    Strategy selecaoEstrategia;


    public SelecaoStrategy(Strategy selecaoEstrategia){
        this.selecaoEstrategia = selecaoEstrategia;
        selecionar();
    }

    public void selecionar(){
        this.selecaoEstrategia.execute();
    }

    //public void 


    
}
