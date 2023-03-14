import javax.swing.JOptionPane;

public class A3_ex16 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        // a dividido por b
        int r1 = a%b;
        int q1 = a/b;

        // b dividido por a
        int r2 = b%a;
        int q2 = b/a;

        System.out.print("Caso deseje dividir o primeiro valor pelo segundo, teremos: \nDividendo = "+a+"\nDivisor = "+b+"\nQuociente = "+q1+"\nResto = "+r1+"\n");
        System.out.print("\nE se dividir o segundo valor pelo primeiro, teremos: \nDividendo = "+b+"\nDivisor = "+a+"\nQuociente = "+q2+"\nResto = "+r2);
    }
}