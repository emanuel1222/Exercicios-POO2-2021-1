
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();
        Batata batata = new Batata(); 
        //controi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", batata);                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", batata);       
    }    
}
