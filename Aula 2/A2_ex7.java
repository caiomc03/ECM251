import javax.swing.JOptionPane;

public class A2_ex7 {
    public static void main (String args[]){
    final char[] lista = new char[4];

    int i =0;

    while (i<4){
        lista[i] = (JOptionPane.showInputDialog("Insira um digito: ")).charAt(0);
        i++;
        }
    i=0;
    while (i<4){
        System.out.print(lista[i]);
        i++;
    }
}
}
