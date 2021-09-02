public abstract class Strategy {

    protected String opcao;
    //protected String opcao_multi = "2";


    public Strategy(String opcao){
        this.opcao = opcao;
       // this.opcao_multi = opcao_multi;
    }
    
    public abstract void execute();
}
