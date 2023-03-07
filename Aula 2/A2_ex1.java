import javax.swing.JOptionPane;

public class A2_ex1 
{
    public static void main (String args[]){
        int i =0;
        
        final String[] lista = new String[3];
        
        while (i<3){
        lista[i] = JOptionPane.showInputDialog("Digite uma palavra: ");
        i++;
        }

        i =0;

        while (i<3){
        System.out.print(lista[i]+" ");
        i++;
        }
    }
}