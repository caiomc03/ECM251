import javax.swing.JOptionPane;

public class A2_ex2 { 
    public static void main(String args []){
        int i =0;
        
        final String[] lista = new String[3];
        
        while (i<3){
        lista[i] = JOptionPane.showInputDialog("Digite uma palavra: ");
        i++;
        }

        i=3;

        while (i>0){
        System.out.print(lista[i-1]+" ");
        i--;
        }

    }
    
}
