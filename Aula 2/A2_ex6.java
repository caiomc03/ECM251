import javax.swing.JOptionPane;

public class A2_ex6 {
 public static void main (String args[]){
    final String[] lista = new String[10];
    int i =0;
    while (i<10){
        lista[i] = JOptionPane.showInputDialog("Digite uma palavra: ");
        i++;
        }
    i=0;
    while (i<10){
        System.out.print(lista[i]);
        i++;
    }
 }
}
