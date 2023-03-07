import javax.swing.JOptionPane;

public class A2_ex4 {

    public static String entrada (String texto){
       String txt = JOptionPane.showInputDialog(texto);
       return(txt);

    }
    
    public static void main(String args []){
        final String[] lista = new String[3];
        
        
        lista[0] = entrada("dia");
        lista[1] = entrada("mes");
        lista[2] = entrada("ano");
        
        System.out.print("A data digitada foi: "+lista[0]+"/"+lista[1]+"/"+lista[2]);
        }
    }

