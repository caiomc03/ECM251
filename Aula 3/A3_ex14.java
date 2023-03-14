import javax.swing.JOptionPane;

public class A3_ex14 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:")); 

        int x = (2 * ((a-c)/8) - b * 5);

        System.out.print("O resultado da operação foi: " + x);

    }

}