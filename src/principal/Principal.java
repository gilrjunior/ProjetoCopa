package principal;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import selecao.Selecao;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList <Selecao> listajogadores = new ArrayList();
        
        int opc = 0;
        String Nome, posicao;
        int numero;
        boolean titular;
            
       do{ 
           opc = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir jogador 2- Sair e mostrar"));

            
            Nome = JOptionPane.showInputDialog("Insira o nome do jogador: ");
            posicao = JOptionPane.showInputDialog("Insira a posicao de "+Nome+": ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de "+Nome+": "));
            titular = Boolean.getBoolean(JOptionPane.showInputDialog(Nome+" é titula? True or False")); 
            
            
            listajogadores.add(new Selecao(Nome, posicao, numero, titular));
            
        }while(opc != 2);
        

         JOptionPane.showMessageDialog(null, listajogadores);

                
    }
    
}
