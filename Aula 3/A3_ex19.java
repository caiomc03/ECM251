import javax.swing.JOptionPane;

public class A3_ex19 {

    public static void main(String[] args) {

        float d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da diagonal maior: "));
        float d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da diagonal menor: "));

        float a = (d1*d2)/2;

        System.out.print("A área do losango é = "+a);
    }
}