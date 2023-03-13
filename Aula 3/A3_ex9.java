import javax.swing.JOptionPane;

public class A3_ex9 {
    public static void main(String args[]) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
        System.out.printf("O logaritimo na base 10 de %.2f é %.2f", num, Math.log10(num));
    }
}