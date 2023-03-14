import javax.swing.JOptionPane;

public class A3_ex15 {

    public static void main(String[] args) {

        double pi = 3.14159;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio do círculo: "));

        double y = pi*(Math.pow(x,2));
        System.out.print("A área do círculo é de: "+y);
    }
}