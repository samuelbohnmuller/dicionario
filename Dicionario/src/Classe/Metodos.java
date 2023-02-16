package Classe;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Metodos {
    // ARRAYLIST QUE OBTERÁ OS TERMOS
    ArrayList<Atributos> termos = new ArrayList();
    
    // QUANDO O MÉTODO FOR CHAMADO, O QUE TIVER EM PARÂMETRO,
    // PASSARÁ VALOR PARA O ARRAYLIST
    public boolean colocarTermos(Atributos at)
    {
        if(termos.add(at))
        {
            JOptionPane.showMessageDialog(null, "Cadastrado");
            return true; 
        }
        else
        {
            return false;
        }
    }
    // MOSTRARÁ TODOS OS VALORES DO ARRAYLIST
    public ArrayList<Atributos> obterTermos()
    {
        return termos;
    }
}
