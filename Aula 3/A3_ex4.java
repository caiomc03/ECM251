import javax.swing.JOptionPane;

public class A3_ex4 {
    public static void main(String args []){

        String txt_tot = "";
        int i=0;
        while (i<3){
        String txt = JOptionPane.showInputDialog("Digite uma palavra: ");
        txt_tot += txt;
        i++;
        }

        System.out.print(txt_tot.length());
        

        
    }
}
