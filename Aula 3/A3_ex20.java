import javax.swing.JOptionPane;

public class A3_ex20 {

    public static void main(String[] args) {

        double a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro lado: "));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo lado: "));
        double angulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ângulo entre eles: "));
        angulo = Math.toRadians(angulo);

        double x = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angulo));

        System.out.println("O valor do terceiro lado é: " + x);

    }
}