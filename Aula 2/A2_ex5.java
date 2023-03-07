import javax.swing.JOptionPane;

public class A2_ex5 {

    public static String entrada (String texto){
        String txt = JOptionPane.showInputDialog(texto);
        return(txt);
 
     }
    public static void main(String args []){
        final String[] lista = new String[2];
        
        lista[0] = entrada("peso");
        lista[1] = entrada("altura");
        
        
        System.out.print("Seus dados digitados foram: "+lista[0]+"kg e "+lista[1]+"m");
        }
    
}
