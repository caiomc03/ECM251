import javax.swing.JOptionPane;

public class A3_ex18 {

    public static void main(String[] args) {

        float b = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da base: "));
        float h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

        float a = (b*h)/2;

        System.out.print("A área do triângulo é = "+a);

    }

}