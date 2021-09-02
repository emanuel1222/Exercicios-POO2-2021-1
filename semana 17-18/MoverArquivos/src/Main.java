import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {  

        //String opcao = JOptionPane.showInputDialog("Opções: 1 - execução com thread / 2 - execução sem thread ");
        //Obs: Reparei que é desnecessário a variável estática opcao na Classe Strategy

        MoveFileSingle mover_s = new MoveFileSingle("1");
        SelecaoStrategy estrategia_s = new SelecaoStrategy(mover_s);

        MoveFileMulti mover_m = new MoveFileMulti("2");
        SelecaoStrategy estrategia_m = new SelecaoStrategy(mover_m);



    }
}
