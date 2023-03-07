import javax.swing.JOptionPane;

public class A3_ex2 {
    public static void main(String[] args){
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da base: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da altura: "));

        int area = base*altura;
        System.out.print(area+" u.m.");
    }
}
