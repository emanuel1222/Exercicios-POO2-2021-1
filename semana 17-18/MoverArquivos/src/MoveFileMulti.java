public class MoveFileMulti extends Strategy{

    public MoveFileMulti(String opcao) {
        super(opcao);
    }


    @Override
    public void execute() {

        Thread thread1 = new MoveFileExtendThread("Thread1");
        thread1.start();
        Thread thread2 = new MoveFileExtendThread("Thread2");
        thread2.start();  

        
    }
    
}
